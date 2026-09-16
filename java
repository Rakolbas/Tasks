function checkNumber(number) {
    let sign = "";
    let parity = "";

    if (number > 0) {
        sign = "положительное";
    } else if (number < 0) {
        sign = "отрицательное";
    } else {
        sign = "ноль";
    }

    if (number % 2 === 0) {
        parity = "чётное";
    } else {
        parity = "нечётное";
    }

    console.log(`число ${number}: ${sign}, ${parity}.`);
}

checkNumber(15);