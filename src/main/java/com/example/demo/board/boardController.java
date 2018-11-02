package com.example.demo.board;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class boardController {

    @Autowired
    private boardMapper mapper;

    @RequestMapping("/board")
    public List<boardVO> boardHome() throws Exception{

        log.debug("/board 호출되었습니다.");
        log.info("/board 호출되었습니다.");
        log.error("/board 호출되었습니다.");
        List<boardVO> list = mapper.selectBoardList();
        return list;
    }

    @RequestMapping("/board2")
    public HashMap<String , Object> board2() throws Exception{
        List<boardVO> list = mapper.selectBoardList();
        HashMap<String, Object> map = new HashMap<>();
        map.put("DATA", list);
        map.put("COUNT", list.size());
        map.put("RESULT","OK");
        return map;
    }

    // Client에서  content-type=application/json 으로 json 데이타 발송시 수신 방법.
    @RequestMapping(value = "/post_json", method = RequestMethod.POST)
    public HashMap<String, Object> post_json(@RequestBody Map<String, Object> payload) throws Exception{
      HashMap<String, Object>  map = new HashMap<>();
      map.put("DATA", payload);
      map.put("RESULT", "OK");

      String keyname = payload.get("keyname").toString();
      Integer age    = Integer.valueOf( payload.get("age").toString() );

      log.info("keyname :" + keyname);
      log.info("age:" + age);
      log.info("map" + map);

      return map;
    }

    @RequestMapping(value = "/post_json2", method = RequestMethod.POST)
    public HashMap<String, Object> post_json2(@RequestBody JSONPObject payload) throws Exception{

        HashMap<String, Object>  map = new HashMap<>();
        map.put("DATA", payload);
        map.put("RESULT", "OK");

        //LOG.info("PayLoad: " + payload.toString() );

        // todo : JSONObject 의 KEY에 해당 하는 값읽는 방법.
        return map;
    }

//    @RequestMapping(
//            value = "/process",
//            method = RequestMethod.POST,
//            consumes = "text/plain")
//    public void process(@RequestBody String payload) throws Exception {
//
//        System.out.println(payload);
//
//    }

    @RequestMapping(value = "/param/{seq}", method = RequestMethod.GET)
    public boardVO boardHello(@PathVariable("seq") int seq) throws Exception{
        boardVO dt = new boardVO();
        dt.setIDX((int) seq);

        return  dt;
    }

    @RequestMapping("/getparam")
    public String restTest(@RequestParam(value = "str", required = false) String str){
        if(str == null) {
            return "str=값 필요합니다.";
        }else {
            return str + " : Rest Test 완료!!!";
        }
    }

}
