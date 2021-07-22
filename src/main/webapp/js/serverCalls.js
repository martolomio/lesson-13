$("button.createProduct")
    .click(
        function () {

            var name = $("form.createProduct input.name").val();
            var description = $("form.createProduct input.description").val();
            var price = $("form.createProduct input.price").val();

            var product = {
                name: name,
                description: description,
                price: price
            };

            $.post("product", product,
                function (data) {
                    if (data == "Success") {
                        alert("Success");
                    }
                });

        });