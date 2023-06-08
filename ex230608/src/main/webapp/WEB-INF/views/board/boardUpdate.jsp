<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>게시글 수정</title>
  </head>
  <body>
    <form name="updateForm" action="boardUpdate" method="POST">
      <div>
        <h3>게시글 수정</h3>
      </div>
      <table>
        <tr>
          <th>번호</th>
          <td>
            <input type="number" name="bno" value="${board.bno}" readonly />
          </td>
        </tr>
        <tr>
          <th>제목</th>
          <td><input type="text" name="title" value="${board.title}" /></td>
        </tr>
        <tr>
          <th>작성자</th>
          <td><input type="text" name="writer" value="${board.writer}" /></td>
        </tr>
        <tr>
          <th>내용</th>
          <td><textarea name="contents" id="contents" cols="30" rows="10">${board.contents}</textarea></td>
        </tr>
        <tr>
          <th>첨부파일</th>
          <td><input type="text" name="image" value="${board.image}" /></td>
        </tr>
        <tr>
          <th>수정날짜</th>
          <td>
            <input type="date" name="updatedate" value="${board.updatedate}" />
          </td>
        </tr>
      </table>
      <button type="submit">수정완료</button>
      <button type="button" onclick="location.href='boardInfo?bNo=${board.bno}'">취소</button>
    </form>
  </body>
</html>
