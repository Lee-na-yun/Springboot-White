package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// Data 받기
// get : http body가 없음 ==> QueryString : From(get) & 브라우저(주소뒤 ?붙이기)
// post,put ==> http body에 담아준다. = form태그(post) & JS
// delete : where절에 걸리는 데이터만 주소에 담아주면 됨, http body가 없음 ==> QueryString & PathVariable(PK)

@RestController
public class SecondController {

	@GetMapping("/second/{id}")	// pk(id)가 1인것을 찾기
	public String getData(@PathVariable Integer id) {
		return "id: "+id;
	}
	
	// QueryString은 -x-www-form-urlencoded 타입이다.
	@GetMapping("/second")	// 쿼리스트링으로 title,content 요청
	public String getData2(String title, String content) {
		return "title:"+title+",content:"+content;
	}
	
	// BR로 받음 ==> 문자열은 title=제목,content=내용 이다. = content type이 x-www머시기다.
	@PostMapping("/second")
	public String postData(String title, String content) { // 스프링 파싱 기본전략 = x-www-머시기이다!
		return "title:"+title+",content:"+content;
	}
	
	@PutMapping("/second")
	public String putData(String title, String content) { 
		return "title:"+title+",content:"+content;
	}
	
	@DeleteMapping("/second/{id}")
	public String deleteData(@PathVariable Integer id) { 
		return "delete ok";
	}
	
	
	
	
	
}
