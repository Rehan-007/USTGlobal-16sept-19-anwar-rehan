import { Directive, ElementRef, HostBinding, HostListener } from "@angular/core";




@Directive({
    selector : '[custDir]'
})


export class CustomDirective {
    constructor(public el : ElementRef){
        this.el.nativeElement.style.backgroundColor = 'yellow';
    }@HostBinding ('style.color') color = 'red';
    @HostListener('mouseenter') m(){
        this.el.nativeElement.style.backgroundColor='brown';
    }
    @HostListener('mouseleave') n(){
       this.el.nativeElement.style.backgroundColor = 'blue';
    }
}