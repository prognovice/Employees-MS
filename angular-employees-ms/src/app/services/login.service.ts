import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable} from 'rxjs';
import { User } from '../common/user';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})

export class LoginService {


  constructor(private http: HttpClient) {
  }
 loginUserFromRemote(user :User) : Observable<any>{
 return  this.http.post<any>("http://localhost:8080/api/v1/login",user)


 }
}
