import { Component } from '@angular/core';
import { HttpClient} from '@angular/common/http';




@Component ({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./home.component.css']
})


export class HomeComponent {
    news;
    constructor (public http:HttpClient) {
        this.getNews();
    }
    getNews(){
                this.http.get<any>  ('https://newsapi.org/v2/top-headlines?country=us&apiKey=7bc0977b015d4d1baf58c90cb22f5f3f').subscribe(data =>{
                    console.log();
                    this.news = data.articles;
                }, err => {
                     console.log(err);
                }, () => {
                    console.log('news got successfull');
                });
            }
}