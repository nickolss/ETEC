var agora = new Date();
var diasem = agora.getDay();

switch (diasem){
    case 0:
        console.log('É domingo')
        break
    
    case 1:
        console.log('É segunda')
        break

    case 2:
        console.log('É terça')
        break

    case 3:
        console.log('É quarta')
        break

    case 4:
        console.log('É quinta')
        break
    
    case 5:
        console.log('É sexta')
        break

    case 6:
        console.log('É sábado')
        break

    default:
        console.log('ERRO')
        break
}