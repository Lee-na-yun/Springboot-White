package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

// http Method 4가지 (=Mapping 기술)
// get 요청 ==> 주소창, 하이퍼링크
// post,get 요청 ==> form 태그
// put, delete,get,post 요청 ==> JS

// 포스트맨으로 4가지 요청을 다 테스트 해볼 수 있음!

@RestController
public class FirstController {

	@GetMapping("/first")	// get=select
	public String getData() {
		return "<h1>data</h1>";
	}
	
	@PostMapping("/first")  // post=insert
	public String postData() {
		return "<h1>insert data</h1>";
	}
	
	@PutMapping("/first")	// put=update
	public String putData() {
		return "<h1>update data</h1>";
	}
	
	@DeleteMapping("/first")
	public String deleteDate() {
		return "<h1>delete data</h1>";
	}
	
	
	
	
	
}
