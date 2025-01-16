import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TokenService {
  token!: any;

  constructor() { }

  // Getter for the token
  gettoken(): string | null {
    return localStorage.getItem('authToken');
  }
  

  // Setter for the token
  setToken(token: any) {
    this.token = token;
  }

  // Method to save the token to localStorage
  saveToken(token: string): void {
    this.token = token;
    localStorage.setItem('authToken', token);
  }

  // Method to load the token from localStorage
  loadToken(): void {
    this.token = localStorage.getItem('authToken');
  }

  // Method to clear the token
  clearToken(): void {
    this.token = null;
    localStorage.removeItem('authToken');
  }
}
