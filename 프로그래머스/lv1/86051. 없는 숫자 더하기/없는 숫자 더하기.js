function solution(numbers) {
    var answer = 0;
    let total = 45;
    for (let i = 0; i < numbers.length; i++, total++) {
        answer += +numbers[i];
    }
    answer = 45 - answer;
    return answer;
}