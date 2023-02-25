package com.example.fintocapp

import com.example.fintocapp.model.*

val link_token = "link_MjplGZ1i4WmQX50K_token_zTjpeyYzSXSCfvmunbiryyDx"
const val secret_key = "sk_test_F9GqyRmemkfBfBxo4yMgHEU-RvjC32qd"

val exampleaccounts: List<Account> = listOf(Account(id= "acc_nMNejK7BT8oGbvO4",
    `object` = "account",
    name= "Cuenta Corriente",
    official_name= "Cuenta Corriente Moneda Local",
    number= "9530516286",
    holder_id= "134910798",
    holder_name= "Jon Snow",
    type= "checking_account",
    currency= "CLP",
    balance= Balance(
        available= 100000,
        current= 400000,
        limit= 500000
    ),
    refreshed_at= "2020-11-18T18:43:54.591Z"),
Account(id= "acc_pvbQlvmTZxBKEzwG",
    `object` = "account",
    name= "Cuenta Corriente",
    official_name= "Cuenta Corriente",
    number= "422159212",
    holder_id= "415792638",
    holder_name= "Anita Navarrete Beltrán",
    type= "checking_account",
    currency= "CLP",
    balance= Balance(
        available= 106691011,
        current= 106691011,
        limit= 106691011
    ),
    refreshed_at= "2023-02-14T20:54:27.570Z"),
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

val examplemovements = arrayListOf<Movement>(
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
        id ="mov_53jYKGHM0DMlYQwd",
        description ="Omnis similique et nam.",
        amount =-6638010,
        currency ="CLP",
        post_date ="2021-02-14T00:00:00Z",
        transaction_date =null,
        type ="transfer",
        recipient_account =RecipientAccount(
            holder_id="584192437",
            number="592934056",
            institution=Institution(
                id="cl_banco_itau",
                name="Banco Itaú",
                country="cl" ),
            holder_name="José María Santacruz Madera"),
        sender_account =null,
        comment =null,
        reference_id =null,
        pending =false,
        `object` ="movement"),
    Movement(id="mov_PDkeRjHolGove90j",description="Qui qui aut est.",amount=9179263,currency="CLP",post_date="2022-02-14T00:00:00Z",transaction_date=null,type="transfer",recipient_account=null,sender_account=SenderAccount(holder_id="584192437",number="226953203",institution=Institution(id="mx_hey_banco",name="Hey Banco",country="mx"),holder_name="Sra. Arturo Anaya Rascón"),comment=null,reference_id=null,pending=false,`object`="movement"),
    Movement(id="mov_Md9Y5PHQAgj9eQLg",description="Ut et repudiandae et.",amount=-7639734,currency="CLP",post_date="2022-11-14T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_r0xNzXHEGkjyeVG6",description="Quod amet nobis est.",amount=-4757642,currency="CLP",post_date="2023-01-13T00:00:00Z",transaction_date=null,type="transfer",recipient_account=RecipientAccount(holder_id="652407749",number="979768510",institution=Institution(id="cl_tenpo",name="Tenpo",country="cl"),holder_name="Rosa Vera Amaya"),sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_bO7Y7RHp3ZQqe4Zl",description="Quaerat dolorum velit dicta.",amount=825890,currency="CLP",post_date="2023-02-15T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement")

)

val moreexamplemovements = arrayListOf<Movement>(
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
        id ="mov_53jYKGHM0DMlYQwd",
        description ="Omnis similique et nam.",
        amount =-6638010,
        currency ="CLP",
        post_date ="2021-02-14T00:00:00Z",
        transaction_date =null,
        type ="transfer",
        recipient_account =RecipientAccount(
            holder_id="584192437",
            number="592934056",
            institution=Institution(
                id="cl_banco_itau",
                name="Banco Itaú",
                country="cl" ),
            holder_name="José María Santacruz Madera"),
        sender_account =null,
        comment =null,
        reference_id =null,
        pending =false,
        `object` ="movement"),
    Movement(id="mov_PDkeRjHolGove90j",description="Qui qui aut est.",amount=9179263,currency="CLP",post_date="2022-02-14T00:00:00Z",transaction_date=null,type="transfer",recipient_account=null,sender_account=SenderAccount(holder_id="584192437",number="226953203",institution=Institution(id="mx_hey_banco",name="Hey Banco",country="mx"),holder_name="Sra. Arturo Anaya Rascón"),comment=null,reference_id=null,pending=false,`object`="movement"),
    Movement(id="mov_Md9Y5PHQAgj9eQLg",description="Ut et repudiandae et.",amount=-7639734,currency="CLP",post_date="2022-11-14T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_r0xNzXHEGkjyeVG6",description="Quod amet nobis est.",amount=-4757642,currency="CLP",post_date="2023-01-13T00:00:00Z",transaction_date=null,type="transfer",recipient_account=RecipientAccount(holder_id="652407749",number="979768510",institution=Institution(id="cl_tenpo",name="Tenpo",country="cl"),holder_name="Rosa Vera Amaya"),sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_bO7Y7RHp3ZQqe4Zl",description="Quaerat dolorum velit dicta.",amount=825890,currency="CLP",post_date="2023-01-15T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_anmNdbH7A3J4ezw4",description="Explicabo animi corrupti nulla.",amount=2064795,currency="CLP",post_date="2023-02-13T00:00:00Z",transaction_date=null,type="transfer",recipient_account=null,sender_account=SenderAccount(holder_id="745931278",number="265823640",institution=Institution(id="cl_banco_consorcio",name="Banco Consorcio",country="cl"),holder_name="José Correa Hinojosa"),comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_pm48wdHlbAlxewGv",description="Iure dolor eum dignissimos.",amount=-4480452,currency="CLP",post_date="2023-02-12T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_ZB9NynHX19Xp8Axp",description="Aut quas est fugit.",amount=2439139,currency="CLP",post_date="2023-02-12T00:00:00Z",transaction_date=null,type="transfer",recipient_account=null,sender_account=SenderAccount(holder_id="745931278",number="571142472",institution=Institution(id="cl_mercado_pago",name="Mercado Pago",country="cl"),holder_name="Inés Estévez Solano"),comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_D9JeE1HzQLgledLl",description="Vel cumque dolorem voluptatibus.",amount=4031538,currency="CLP",post_date="2023-02-12T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_BX28ZBH0vlbD87bo",description="Nihil asperiores ea beatae.",amount=4888286,currency="CLP",post_date="2023-02-12T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_XDKYjpHPkwqO8Eyq",description="Eaque similique quia omnis.",amount=-8016814,currency="CLP",post_date="2023-02-12T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_xq4Y9WHbRLbA8PEO",description="Error ad vel beatae.",amount=-2270381,currency="CLP",post_date="2023-02-11T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_grK8G4H23Rrne51o",description="A officia voluptatem rem.",amount=-2771002,currency="CLP",post_date="2023-02-11T00:00:00Z",transaction_date=null,type="transfer",recipient_account=RecipientAccount(holder_id="791209161",number="412240201",institution=Institution(id="mx_banco_bbva",name="Banco BBVA",country="mx"),holder_name="Lourdes Vélez Olivárez"),sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_D5XekJHLB7Lw8wjE",description="Voluptate at voluptas laborum.",amount=4379692,currency="CLP",post_date="2023-02-10T00:00:00Z",transaction_date=null,type="transfer",recipient_account=null,sender_account=SenderAccount(holder_id="745931278",number="449493671",institution=Institution(id="cl_banco_bci",name="Banco BCI",country="cl"),holder_name="Sra. Vicente Jurado Saldivar"),comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_bO7Y7RHp3ZQye4Zl",description="Veritatis veniam autem enim.",amount=1045195,currency="CLP",post_date="2023-02-09T00:00:00Z",transaction_date=null,type="transfer",recipient_account=null,sender_account=SenderAccount(holder_id="652407749",number="424795933",institution=Institution(id="cl_banco_falabella",name="Banco Falabella",country="cl"),holder_name="José Calvillo Guajardo"),comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_APl8W5H5RQ5GY9gb",description="Nesciunt reiciendis ab incidunt.",amount=-7259909,currency="CLP",post_date="2023-02-08T00:00:00Z",transaction_date=null,type="transfer",recipient_account=RecipientAccount(holder_id="652407749",number="938339394",institution=Institution(id="cl_banco_itau",name="Banco Itaú",country="cl"),holder_name="Sr. Guadalupe Ceja Jiménez"),sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_dLMeQ7HOR5OLNoAv",description="Qui qui tenetur aliquam.",amount=6404731,currency="CLP",post_date="2023-02-08T00:00:00Z",transaction_date=null,type="transfer",recipient_account=null,sender_account=SenderAccount(holder_id="652407749",number="732715523",institution=Institution(id="cl_prepago_los_heroes",name="Prepago Los Héroes",country="cl"),holder_name="Alicia Rubio Lozano"),comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_mrQe26HRoDR6e5kd",description="Nam quo qui amet.",amount=848320,currency="CLP",post_date="2023-02-07T00:00:00Z",transaction_date=null,type="transfer",recipient_account=null,sender_account=SenderAccount(holder_id="791209161",number="185705834",institution=Institution(id="cl_banco_itau",name="Banco Itaú",country="cl"),holder_name="Claudia Abreu Lira"),comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_pv5Yo1HpwOLO8gqj",description="Magnam autem aliquam eveniet.",amount=-7748670,currency="CLP",post_date="2023-02-07T00:00:00Z",transaction_date=null,type="transfer",recipient_account=RecipientAccount(holder_id="791209161",number="622404562",institution=Institution(id="mx_banco_santander",name="Banco Santander",country="mx"),holder_name="Alberto Carreón Gaitán"),sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_rA7N4lHDXVmQNVzj",description="Voluptatibus sunt sit eveniet.",amount=7631527,currency="CLP",post_date="2023-02-07T00:00:00Z",transaction_date=null,type="transfer",recipient_account=null,sender_account=SenderAccount(holder_id="652407749",number="785409598",institution=Institution(id="cl_banco_estado",name="Banco Estado",country="cl"),holder_name="Natalia González Ureña"),comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_APl8W5H56XEEY9gb",description="Autem sapiente minus quas.",amount=4879039,currency="CLP",post_date="2023-02-07T00:00:00Z",transaction_date=null,type="transfer",recipient_account=null,sender_account=SenderAccount(holder_id="584192437",number="472100891",institution=Institution(id="cl_banco_corpbanca",name="Banco Corpbanca",country="cl"),holder_name="Santiago Caballero Serrato"),comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_jLD8gMHO45DPY5B9",description="Totam rerum officiis dolore.",amount=1797974,currency="CLP",post_date="2023-02-07T00:00:00Z",transaction_date=null,type="transfer",recipient_account=null,sender_account=SenderAccount(holder_id="745931278",number="401800455",institution=Institution(id="mx_banco_banamex",name="Banco Banamex",country="mx"),holder_name="Micaela Agosto Carrion"),comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_z3kerxHAa0QJNWgn",description="Sint dolor reprehenderit quas.",amount=-3543892,currency="CLP",post_date="2023-02-07T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_D9JeE1Hz9Rv3edLl",description="Quaerat esse odio quis.",amount=6443758,currency="CLP",post_date="2023-02-07T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_j4yeaPHoEVAP8XOP",description="Et nesciunt reprehenderit natus.",amount=351033,currency="CLP",post_date="2023-02-07T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_BqDe3AH0ZzqxNWEm",description="Cum est ut expedita.",amount=-8432300,currency="CLP",post_date="2023-02-07T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_ok9NmKHLxzLpeGA3",description="Qui aut modi ea.",amount=-5289573,currency="CLP",post_date="2023-02-06T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_BLg8DDH1k7158kAx",description="Placeat ipsam nesciunt corporis.",amount=4760010,currency="CLP",post_date="2023-02-06T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_BqDe3AH06Jn5NWEm",description="Sunt dolores ducimus mollitia.",amount=-1427032,currency="CLP",post_date="2023-02-06T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement"),Movement(id="mov_qV1Y0BH7y2aX8m65",description="Eos repellat tenetur laboriosam.",amount=-8982931,currency="CLP",post_date="2023-02-06T00:00:00Z",transaction_date=null,type="other",recipient_account=null,sender_account=null,comment=null,reference_id=null,pending=false,`object`="movement")

)