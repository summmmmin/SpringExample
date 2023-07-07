<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 업로드</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
</head>
<body>
	<!-- <form enctype="multipart/form-data"> -->
	<div>
		<input name="uploadFiles" type="file" multiple>
		<button class="uploadBtn">Upload</button>	
	</div>
	<!-- </form> -->
</body>
<script type="text/javascript">
$('.uploadBtn').click(function(){
	var formData = new FormData();	//FormData객체 생성
	
	var inputFile = $("input[type='file']");
	//input 태그의 type이 file인 것을 찾아서 inputFile이라는 변수로 지정
	
	var files = inputFile[0].files;
	//files : 선택한 모든 파일을 나열하는 filelist객체이다
	//multiple 특성을 지정하지 않았다면 두 개 이상의 파일을 포함하지 않습니다.
	
	for(var i=0; i<files.length; i++){
		console.log(files[i]);
		formData.append("uploadFiles", files[i]);  //키,값으로 append
	}
	
	//실제 업로드 부분
	//fetch
	/*fetch('uploadsAjax', {
		method : 'POST',
		body : formData
	})
	.then(response => response.text())
	.then(data => console.log(data))
	.catch(err => console.log(err))
	*/
	
	
	//jQuery.ajax
	$.ajax({
		url: 'uploadsAjax',
		type='POST',
		processData: false,		// 기본값은 true, ajax 통신을 통해 데이터를 전송할때 기본적으로 key, value를 query String으로 전송
		contentType: false,		// multipart/form-data타입을 사용하기 위해 false로 지정
		data: formData,
		success: function(result){
			console.log(result);
		},
		error: function(reject){
			console.log(reject);
		}
	})
})
</script>
</html>