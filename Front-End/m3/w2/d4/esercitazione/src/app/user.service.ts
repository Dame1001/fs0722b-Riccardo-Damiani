import { Injectable } from '@angular/core';
import { User } from './user.interface';
import { getMaxListeners } from 'process';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  allUsers: User[] = [
    {
      id:1,
      nome:"Francesco",
      cognome:"Pastore",
      email:"francesco.pastore@gmail.com"
    },
    {
      id:2,
      nome:"Stefano",
      cognome:"Gavioli",
      email:"stefano.gavioli@gmail.com"
    },
    {
      id:3,
      nome:"Riccardo",
      cognome:"Damiani",
      email:"riccardo.damiani@gmail.com"
    },
    {
      id:4,
      nome:"Umberto",
      cognome:"Diodoro",
      email:"umberto.diodoro@gmail.com"
    },
    {
      id:5,
      nome:"Damiano",
      cognome:"Tiberi",
      email:"damiano.tiberi@gmail.com"
    }
  ]

  constructor() { }
}
