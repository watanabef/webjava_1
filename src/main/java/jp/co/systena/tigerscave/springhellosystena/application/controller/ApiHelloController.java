package jp.co.systena.tigerscave.springhellosystena.application.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

// Viewなし。jsonやxmlを返却するアノテーション
@RestController
public class ApiHelloController {
  @RequestMapping(value = "/ApiHello") // URLとのマッピング
  public Map<String, String> hello() {

    Map<String, String> map = new HashMap<String, String>();
    map.put("message", "API Systena!!" + new java.util.Date());
    return map; // 文字列を返却
  }
}
