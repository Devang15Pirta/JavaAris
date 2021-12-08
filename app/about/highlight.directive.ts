import { Directive,ElementRef,Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHighlight]'
})
export class HighlightDirective {

  constructor(private el:ElementRef,private renderer:Renderer2) {
    el.nativeElement.style.styleColor="blue";
   }
   ngOnInit(){
     this.renderer.setStyle(this.el.nativeElement,'background-color','red');
     this.renderer.setStyle(this.el.nativeElement,'font-family','Arial, Helvetica, sans-serif');
     this.renderer.setStyle(this.el.nativeElement,'margin','50px 100px');
   }

}
