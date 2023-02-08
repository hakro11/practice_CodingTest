function solution(s) {
    var answer = "";
    let catchNum = [
        [`one`, `1`],
        [`two`, `2`],
        [`three`, `3`],
        [`four`, `4`],
        [`five`, `5`],
        [`six`, `6`],
        [`seven`, `7`],
        [`eight`, `8`],
        [`nine`, `9`],
        [`zero`, `0`]
    ];

    for(let i = 0 ; i < catchNum.length ; i++){
        s = s.replaceAll(`${catchNum[i][0]}`,`${catchNum[i][1]}`);
    }
    answer = parseInt(s);
    return answer;
}