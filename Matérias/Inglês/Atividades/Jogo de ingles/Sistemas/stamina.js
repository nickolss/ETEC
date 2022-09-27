class acoes{
    perdersta(n1,n2){
        return n1-n2
    }

    ganharsta(n1,n2){
        return n1+n2
    }
}

//variaveis
var acao = new acoes()
var stamina = [5,4,3,2,1,0]
var resp = document.getElementById('resp')


function atacar(n1){
    
    if(stamina[0]==5){
        stamina = [4,3,2,1,0]
        alert(stamina[0])
    }else if(stamina[0]==4){
        stamina = [3,2,1,0]
        alert(stamina[0])
    }else if(stamina[0]==3){
        stamina = [2,1,0]
        alert(stamina[0])
    }else if(stamina[0] ==2){
        stamina = [1,0]
        alert(stamina[0])
    }else if(stamina[0] ==1){
        stamina = [0]
        alert(stamina[0])
    }else if(stamina[0] == 0){
        alert('SEM STAMINA')
    }

    alert(staminaat)
}