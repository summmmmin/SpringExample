<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>게시글 등록</title>
  </head>
  <body>
    <form name="insertForm" action="boardInsert" method="POST">
      <div>
        <h3>게시글 정보</h3>
      </div>
      <table>
        <tr>
          <th>제목</th>
          <td><input type="text" name="title" /></td>
        </tr>
        <tr>
          <th>작성자</th>
          <td><input type="text" name="writer" /></td>
        </tr>
        <tr>
          <th>내용</th>
          <td><textarea name="contents" id="" cols="30" rows="10"></textarea></td>
        </tr>
        <tr>
          <th>첨부이미지</th>
          <td><input type="text" name="image" /></td>
        </tr>
      </table>
      <button type="submit">등록</button>
      <button type="button" onclick="location.href=boardList">목록</button>
    </form>
    
    <script type="text/javascript">
    document.querySelector("form[name='insertForm']")
    		.addEventListener('submit', function(e){
    			e.preventDefault();
    			let title = document.getElementsByName('title')[0];
    			let writer = document.getElementsByName('writer')[0];
    			let contents = document.getElementsByName('contents')[0];
    			
    			if(title.value == ''){
    				alert('제목이 입력되지 않았다');
    				title.focus();
    				return;
    			}
    			if(writer.value == ''){
    				alert('작성자 입력되지 않았다');
    				writer.focus();
    				return;
    			}
    			if(contents.value == ''){
    				alert('내용이 입력되지 않았다');
    				contents.focus();
    				return;
    			}
    			
    			insertForm.submit();
    		})
    </script>
  </body>
</html>
