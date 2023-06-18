import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../environments/environment';
import { Result } from '../app/model/result';

@Injectable({
  providedIn: 'root'
})
export class KataForFunService {
  private endpoint = `${environment.baseUrl}/kata-for-fun`;
  private inputNumber: number;

  constructor(private httpClient: HttpClient) { }

  public convertNumber(inputNumber: number): Observable<Result> {
    return this.httpClient.get<Result>(`${this.endpoint}/${inputNumber}`);
  }
}
