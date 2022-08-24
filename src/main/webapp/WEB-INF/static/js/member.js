/**
 * 
 */
 
  var pwconfirm= false; //비밀번호 확인 여부를 확인하는 변수

    function passwordconfirm(){
        var password = document.querySelector("#password");
        var repassword = document.querySelector("#repassword");

        if(password.value=="" || repassword.value==""){
            alert("비밀번호를 확인하세요.")
            return;
        }

        if(password.value==repassword.value){
            alert("비밀번호 확인이 되었습니다.");
            pwconfirm=true;
        }else{
            alert("비밀번호가 일치하지 않습니다.");
            pwconfirm=false;
        }

    }

    function createmember(){
        var id = document.querySelector("#id");
        var password = document.querySelector("#password");
        var repassword = document.querySelector("#repassword");
        var email = document.querySelector("#email");
        var nickname = document.querySelector("#nickname");

        if (id.value=="" || password.value=="" || repassword.value=="" 
        || email.value=="" || nickname.value=="") {
            alert("입력 값을 확인하세요.");
            id.focus();
            return;
        }
        if(pwconfirm==false || password.value!=repassword.value){
            alert("비밀번호 확인을 하셔야 합니다.");
            return;
        }
        if (!/\S*\@\S*\.S*/.test(email.value)) {
            alert("이메일주소를 확인하세요.");
            email.focus();
            return;
        }
            alert("회원가입이 되었습니다.");
            document.forms[0].submit();
        

    }