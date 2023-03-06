package chap12.sec05;
import lombok.*;
//lombok 없어서 어노테이션이 안되는거임
@Data
public class Member {
	private final String id;
	@NonNull private String name;
	private int age;
}
