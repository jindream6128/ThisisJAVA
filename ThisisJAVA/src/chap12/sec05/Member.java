package chap12.sec05;
import lombok.*;

@Data
public class Member {
	private final String id;
	@NonNull private String name;
	private int age;
}
