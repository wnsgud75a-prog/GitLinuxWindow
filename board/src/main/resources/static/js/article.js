const deleteBtn = document.getElementById('delete-btn');
const modifyButton = document.getElementById('modify-btn');
const createButton = document.getElementById('create-btn');

if(deleteBtn){
    deleteBtn.addEventListener('click', ()=>{ //delete 버튼이 클릭이 되었을 때 처리할 콜백함수
        //현재 게시물의 id (input type=hidden)  (input은 value 속성에 값이 저장됨)
        let id = document.getElementById('article-id').value;
        //fetch(비동기통신)
        fetch(`/api/articles/${id}`, {
            method : 'DELETE'
        })
            .then(()=>{
                alert('삭제가 완료 되었습니다');
                //articleList.html로 이동
                // (** /articles 경로로 요청하면 현재 DB에 있는 값만 불러와서 리스트로 새롭게 출력해줌!)
                location.replace('/articles');
            });
    });
}

if(modifyButton){
    modifyButton.addEventListener('click', ()=>{
        let id = document.getElementById('article-id').value;
        fetch(`/api/articles/${id}`, {
            method : 'PUT',
            headers : { //요청 파라미터(데이터)의 형식 지정
                "Content-Type" : "application/json",
            }, //JSON 형식의 데이터를 문자열형태로 변환(JSONObject -> String)
            body : JSON.stringify({
                title : document.getElementById('title').value,
                content : document.getElementById('content').value
            })
        })
            .then(()=>{
                alert('수정이 완료 되었습니다');
                location.replace(`/articles/${id}`);
            })
    });
}

if(createButton){
    createButton.addEventListener('click', ()=>{
        fetch('/api/articles', {
            method : 'POST',
            headers : {
                "Content-Type" : "application/json",
            },
            body : JSON.stringify({
                title : document.getElementById('title').value,
                content : document.getElementById('content').value
            })
        })
            .then(()=>{
                alert('등록 완료 되었습니다');
                location.replace('/articles');
            })
    });
}
