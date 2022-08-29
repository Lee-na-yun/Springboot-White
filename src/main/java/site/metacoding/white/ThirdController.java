package site.metacoding.white;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Third;

// 고급 데이터 받기(json, x-www-from-urlencoded, text)
// body데이터 받는 연습

@RestController
public class ThirdController {

	
	@PostMapping("/third")
	public String postData(Third third) { // string머시기가 아닌 object를 그대로 적음 ==> 스프링이 알아서 인식함!(dispatcher servlet) = request dto
		return "id : "+third.getId()+", title : "+third.getTitle()+", content : "+third.getContent();
	}
	// 값을 가진 DTO를 만들면 DS가 자동으로 new해서 띄우고 setter를 때림
	
	
	// UPDATE third SET title = ? content=? WHERE id=? 를 받는것과 동일함!
	@PutMapping("/third/{id}")
	public String putData(@PathVariable Integer id, Third third) { //id를 빼고 받아야함 -> id는 {id}니까 주소에 적음
		return third.toString();
	}
	// 어떤 데이터 한건 수정해주세요=where절 데이터 ==> 주소로 보내야함
	
	@PutMapping("/third/{id}/json")
	public String putJsonData(@PathVariable Integer id, @RequestBody Third third) { 
		return third.toString();
	}
	
	
	
	
	
	
	
	
}
