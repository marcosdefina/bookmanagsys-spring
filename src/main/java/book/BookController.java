package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/books")
    public Book booking(@RequestParam(value="name", defaultValue="World") String name, String excerpt) {
        return new Book(counter.incrementAndGet(),
                            String.format(template, name),
                            String.format(excerpt));
    }
}
