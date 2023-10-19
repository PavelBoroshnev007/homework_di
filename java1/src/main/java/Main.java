import config.AnnotationConfig;
import controller.PostController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.PostService;

public class Main {
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        final var controller = context.getBean(PostController.class);
        final var service = context.getBean(PostService.class);
        final var isSame = service == context.getBean("postService");
    }
}
