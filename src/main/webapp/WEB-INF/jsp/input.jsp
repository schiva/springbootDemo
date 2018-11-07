<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>JSP Input</title>
</head>
<body>
    <form action="/board_write">
        idx<br>
        <input type="text" name="IDX"><br>
        parnet_idx<br>
        <input type="text" name="PARENT_IDX"><br>
        title<br>
        <input type="text" name="TITLE"><br>
        contents<br>
        <input type="text" name="CONTENTS"><br>
        hit_cnt<br>
        <input type="text" name="HIT_CNT"><br>
        del_gb<br>
        <input type="text" name="DEL_GB"><br>
        crea_dtm<br>
        <input type="text" name="CREA_DTM"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
