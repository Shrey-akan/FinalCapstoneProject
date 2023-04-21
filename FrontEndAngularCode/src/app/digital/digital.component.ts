import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-digital',
  templateUrl: './digital.component.html',
  styleUrls: ['./digital.component.css']
})
export class DigitalComponent implements OnInit{
  shoeImages : Boolean = false;
ngOnInit(): void {
    
}
showMoreImage(){
  this.shoeImages=!this.shoeImages;
}
  
}
