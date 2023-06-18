import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { KataForFunService } from '../kata-for-fun.service';

@Component({
  selector: 'app-kata-for-fun',
  templateUrl: './kata-for-fun.component.html'
})
export class KataForFunComponent implements OnInit, OnDestroy {
  numbersConverted: NumberConverted[] = [];
  private subscription: Subscription;

  constructor(private kataForFunService: KataForFunService) { }

  ngOnInit(): void {
  }

  convertNumber(inputNumber: number): void {
      this.subscription = this.kataForFunService.convertNumber(inputNumber).subscribe(response => this.numbersConverted
      .push({numberToConvert: inputNumber, result: response.result}), (error) => console.log(error));
  }

  ngOnDestroy(): void {
     this.subscription?.unsubscribe();
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
