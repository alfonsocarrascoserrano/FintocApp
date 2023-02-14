package com.example.banco

import com.example.banco.model.*

val accounts: List<Account> = listOf(Account(id= "acc_nMNejK7BT8oGbvO4",
    `object` = "account",
    name= "Cuenta Corriente",
    official_name= "Cuenta Corriente Moneda Local",
    number= "9530516286",
    holder_id= "134910798",
    holder_name= "Jon Snow",
    type= "checking_account",
    currency= "CLP",
    balance= Balance(
        available= 500000,
        current= 500000,
        limit= 500000
    ),
    refreshed_at= "2020-11-18T18:43:54.591Z"),
Account(id= "acc_nMNejK7BT8oGbvO4",
    `object` = "account",
    name= "Cuenta Corriente",
    official_name= "Cuenta Corriente Moneda Local",
    number= "9530516286",
    holder_id= "134910798",
    holder_name= "Jon Snow",
    type= "checking_account",
    currency= "CLP",
    balance= Balance(
        available= 500000,
        current= 500000,
        limit= 500000
    ),
    refreshed_at= "2020-11-18T18:43:54.591Z"),
Account(id= "acc_nMNejK7BT8oGbvO4",
    `object` = "account",
    name= "Cuenta Corriente",
    official_name= "Cuenta Corriente Moneda Local",
    number= "9530516286",
    holder_id= "134910798",
    holder_name= "Jon Snow",
    type= "checking_account",
    currency= "CLP",
    balance= Balance(
        available= 500000,
        current= 500000,
        limit= 500000
    ),
    refreshed_at= "2020-11-18T18:43:54.591Z")
)

val movements = listOf<Movement>(
    Movement(
        id = "mov_BO381oEATXonG6bj",
        `object` =  "movement",
        amount = 59400,
        post_date = "2020-04-17T00:00:00.000Z",
        description = "Traspaso de:Fintoc SpA",
        transaction_date = "2020-04-16T11:31:12.000Z",
        currency = "CLP",
        reference_id = "123740123",
        type = "transfer",
        pending = false,
        recipient_account = null,
        sender_account = SenderAccount(
            holder_id= "771806538",
            holder_name= "Comercial y Producción SpA",
            number= "1530108000",
            institution= Institution(
                id= "cl_banco_de_chile",
                name= "Banco de Chile",
                country= "cl"
            )
        ),
        comment = "Pago factura 198"
    ),
    Movement(
        id = "mov_BO381oEATXonG6bj",
        `object` =  "movement",
        amount = 59400,
        post_date = "2020-04-17T00:00:00.000Z",
        description = "Traspaso de:Fintoc SpA",
        transaction_date = "2020-04-16T11:31:12.000Z",
        currency = "CLP",
        reference_id = "123740123",
        type = "transfer",
        pending = false,
        recipient_account = null,
        sender_account = SenderAccount(
            holder_id= "771806538",
            holder_name= "Comercial y Producción SpA",
            number= "1530108000",
            institution= Institution(
                id= "cl_banco_de_chile",
                name= "Banco de Chile",
                country= "cl"
            )
        ),
        comment = "Pago factura 198"
    ),
    Movement(
        id = "mov_BO381oEATXonG6bj",
        `object` =  "movement",
        amount = 59400,
        post_date = "2020-04-17T00:00:00.000Z",
        description = "Traspaso de:Fintoc SpA",
        transaction_date = "2020-04-16T11:31:12.000Z",
        currency = "CLP",
        reference_id = "123740123",
        type = "transfer",
        pending = false,
        recipient_account = null,
        sender_account = SenderAccount(
            holder_id= "771806538",
            holder_name= "Comercial y Producción SpA",
            number= "1530108000",
            institution= Institution(
                id= "cl_banco_de_chile",
                name= "Banco de Chile",
                country= "cl"
            )
        ),
        comment = "Pago factura 198"
    ),
    Movement(
        id = "mov_BO381oEATXonG6bj",
        `object` =  "movement",
        amount = 59400,
        post_date = "2020-04-17T00:00:00.000Z",
        description = "Traspaso de:Fintoc SpA",
        transaction_date = "2020-04-16T11:31:12.000Z",
        currency = "CLP",
        reference_id = "123740123",
        type = "transfer",
        pending = false,
        recipient_account = null,
        sender_account = SenderAccount(
            holder_id= "771806538",
            holder_name= "Comercial y Producción SpA",
            number= "1530108000",
            institution= Institution(
                id= "cl_banco_de_chile",
                name= "Banco de Chile",
                country= "cl"
            )
        ),
        comment = "Pago factura 198"
    )

)