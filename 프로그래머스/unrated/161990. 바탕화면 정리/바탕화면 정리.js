'use strict';
function solution(wallpaper) {
    
let minX = 51, minY = 51, maxX = 0, maxY = 0;

for(let i = 0; i < wallpaper.length; i++){
    for(let j = 0; j < wallpaper[i].length; j++){
        if(wallpaper[i][j] == '#'){
            if(minY >= i ){
                minY = i;
            }

            if(maxY <= i){
                maxY = i + 1;
            }
            if(minX >= j){
                minX = j;
            }

            if(maxX <= j){
                maxX = j + 1;
            }

        }
    }
}

let answer = [minY, minX, maxY, maxX];

    return answer;
}