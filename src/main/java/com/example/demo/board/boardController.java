package com.example.demo.board;



import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class boardController {

    private static final Log LOG = LogFactory.getLog( boardController.class );

    @Autowired
    private boardMapper mapper;

    @RequestMapping("/board")
    public List<boardVO> boardHome() throws Exception{

        LOG.debug("/board 호출되었습니다.");
        LOG.info("/board 호출되었습니다.");
        LOG.error("/board 호출되었습니다.");
        List<boardVO> list = mapper.selectBoardList();
        return list;
    }

    @RequestMapping(value = "/param/{seq}", method = RequestMethod.GET)
    public boardVO boardHello(@PathVariable("seq") int seq) throws Exception{
        boardVO dt = new boardVO();
        dt.setIDX((int) seq);

        return  dt;
    }

//    http://localhost:8080/getparam?str=test
    @RequestMapping("/getparam")
    public String restTest(@RequestParam(value = "str", required = false) String str){
        if(str == null) {
            return "str=값 필요합니다.";
        }else {
            return str + " : Rest Test 완료!!!";
        }
    }

}
