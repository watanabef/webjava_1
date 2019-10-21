package jp.co.systena.tigerscave.springhellosystena.application.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Viewあり。Viewを返却するアノテーション
public class SpringHelloSystenaController {

  @RequestMapping("/SpringHello") // URLとのマッピング
  public String index(HttpSession session, Model model,
                            @RequestParam(name = "name", required = false) String name) {
    // Viewに渡すデータを設定
    model.addAttribute("name", name);
    model.addAttribute("message", new java.util.Date());

    // Viewのテンプレート名を返す
    return "springhellosystena";
  }
}
