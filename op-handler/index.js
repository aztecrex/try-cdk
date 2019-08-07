
exports.handle = async function() {
    return {
        statusCode: 200,
        headers: {},
        body: JSON.stringify({
            name: "Stonebrook",
            shoeSize: 14.5,
            birthday: "happy",
        })
    };
}
