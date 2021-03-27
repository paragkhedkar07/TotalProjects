import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Info } from '../model/info';

@Injectable({
  providedIn: 'root'
})
export class CustomerregistrationService {
  url:string = 'http://localhost:3000/info';
   constructor(private http: HttpClient) {}

  savedata(data: Info) {
    console.log(data);
    this.http.post(this.url,data).subscribe();
}
getdata(){
return this.http.get(this.url);
}

}