import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { importType } from '@angular/compiler/src/output/output_ast';
import {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {

   fireBaseUrl ='https://ust-poi.firebaseio.com/ ';
  constructor(public http: HttpClient) { }
  postUser(data) {
    console.log('service', data);
    return this.http.post(`${this.fireBaseUrl}/users.json`, data);
  }
  getUsers(){
    return this.http.get(`${this.fireBaseUrl}/users.json`).pipe(
      map(data =>{
        let newArray = [];
        for (let key in data) {
          newArray.push({...data[key], id:key})
        }
        return newArray;
      })
    )
  }
  updateUser(id , data){
     return this.http.put(`${this.fireBaseUrl}/users/${id}.json`,data)
  }
  deleteUser(id) {
     return this.http.delete(`${this.fireBaseUrl}/users/${id}.json`);
  }
}
