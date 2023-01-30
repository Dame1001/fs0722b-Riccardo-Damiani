import { Injectable } from '@angular/core';
import { Post } from './post';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  //riferimento per tutti i post - verrà letto dai component che devono visualizzare questi dati
  allPosts:Post[] = [
    {
        id:1,
        body:"Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.",
        title:"Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.",
        active:true,
        type:"news",
        author:"Francesco Pastore"
    },
    {
        id:2,
        body:"Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.",
        title:"Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.",
        active:true,
        type:"politics",
        author:"Stefano Gavioli"
    },
    {
        id:3,
        body:"Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.",
        title:"Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.",
        active:true,
        type:"education",
        author:"Riccardo Damiani"
    },
    {
        id:4,
        body:"Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.",
        title:"Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.",
        active:false,
        type:"news",
        author:"Umberto Diodoro"
    },
    {
        id:5,
        body:"Sit minim deserunt enim enim nisi. Eiusmod incididunt dolore et ea anim. Non exercitation id voluptate et velit quis anim officia fugiat esse laborum nisi fugiat non.",
        title:"Dolor velit sint tempor culpa cupidatat ipsum do ad tempor eiusmod.",
        active:false,
        type:"politics",
        author:"Damiano Tiberi"
    }
]


  fetchData() {
    //Lettura dati da file json a array di riferimento del service
    fetch("assets/db.json").then(res=>res.json()).then(res=>{
      this.allPosts = res
      console.log(res);
    })
  }

  getPostFiltrati(a: boolean) {
    //lettura sincrona dei post a partire dall'array del service
    return this.allPosts.filter(p=>p.active==a)
  }

  toggle(id:number) {
    //inveerte active del post con l'id indicato (modificando l'array del service)
    //questa modifica si noterà alla prima lettura con getPostFiltrati
    this.allPosts = this.allPosts.map((p)=>{
      if(p.id==id) p.active = !p.active
      return p
    })
    //qua modifico il db
  }

  constructor() {
    //per leggere i dati all'inizio
    this.fetchData()
    //!!!ATTENZIONE
    //essendo questa una lettura asincrona è possibile che getPostFiltrati() dei component active/inactive venga eseguita prima del completamento di questa logica, quindi i componenti leggerebero un array vuoto la prima volta (puoi notarlo ricaricando la pagina da /active, finche non cambi pagina e rientri in active non vedrai nessun post)
  }
}
