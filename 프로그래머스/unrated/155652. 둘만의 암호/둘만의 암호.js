function solution(s, skip, index) {
    var answer = '';
        let alphabet = "abcdefghijklmnopqrstuvwxyz";
    for (let i = 0; i < skip.length; i++) {
        alphabet = alphabet.replace(`${skip[i]}`, ``);
    }

    for (let i = 0, savenum; i < s.length; i++) {
        for(let j = 0 ; j < alphabet.length ; j++){
            if(s[i] == alphabet[j]){
                savenum = j;
                break;
            }
        }
        answer += alphabet[(savenum+index) % alphabet.length];
    }
    return answer;
}