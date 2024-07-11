package com.gabriel.timezonefetcher.services;

import org.springframework.stereotype.Service;

@Service
public class CountryZoneIdService {

    public String getZoneIdByCountry(String country) {

        switch (country) {
            case "Algeria":
            case "Angola":
            case "Benin":
            case "Chad":
            case "Central African Republic":
            case "Congo":
            case "Equatorial Guinea":
            case "Gabon":
            case "Niger":
            case "Nigeria":
                return "UTC+1";
            case "Botswana":
            case "Burundi":
            case "Egypt":
            case "Eswatini":
            case "Lesotho":
            case "Malawi":
            case "Mozambique":
            case "Rwanda":
            case "South Africa":
            case "Sudan":
            case "Zambia":
            case "Zimbabwe":
                return "UTC+2";
            case "Burkina Faso":
            case "Gambia":
            case "Ghana":
            case "Guinea":
            case "Guinea-Bissau":
            case "Ivory Coast":
            case "Liberia":
            case "Mali":
            case "Mauritania":
            case "Senegal":
            case "Sierra Leone":
            case "Togo":
            case "São Tomé and Príncipe":
                return "UTC+0";
            case "Cape Verde":
                return "UTC-1";
            case "Comoros":
            case "Djibouti":
            case "Eritrea":
            case "Ethiopia":
            case "Kenya":
            case "Somalia":
            case "South Sudan":
            case "Tanzania":
            case "Uganda":
            case "Yemen":
                return "UTC+3";
            case "Libya":
            case "Namibia":
            case "Tunisia":
                return "UTC+2";
            case "Madagascar":
            case "Mauritius":
            case "Seychelles":
                return "UTC+4";
            case "Afghanistan":
                return "UTC+4:30";
            case "Armenia":
            case "Azerbaijan":
            case "Georgia":
            case "Kazakhstan (West)":
            case "Pakistan":
            case "Turkmenistan":
            case "Uzbekistan":
                return "UTC+5";
            case "Bangladesh":
            case "Bhutan":
                return "UTC+6";
            case "Brunei":
            case "China":
            case "Indonesia (Central)":
            case "Malaysia":
            case "Mongolia (East)":
            case "Philippines":
            case "Singapore":
            case "Taiwan":
            case "North Korea":
            case "South Korea":
            case "Timor-Leste":
                return "UTC+8";
            case "Cambodia":
            case "Laos":
            case "Thailand":
            case "Vietnam":
                return "UTC+7";
            case "Cyprus":
            case "Israel":
            case "Jordan":
            case "Lebanon":
            case "Palestine":
            case "Syria":
                return "UTC+2";
            case "India":
            case "Sri Lanka":
                return "UTC+5:30";
            case "Indonesia (West)":
                return "UTC+7";
            case "Indonesia (East)":
                return "UTC+9";
            case "Iran":
                return "UTC+3:30";
            case "Iraq":
            case "Kuwait":
            case "Qatar":
            case "Saudi Arabia":
                return "UTC+3";
            case "Japan":
                return "UTC+9";
            case "Nepal":
                return "UTC+5:45";
            case "Oman":
            case "United Arab Emirates":
                return "UTC+4";
            case "Kyrgyzstan":
            case "Kazakhstan (East)":
                return "UTC+6";
            case "Belarus":
                return "UTC+3";
            case "Portugal (Azores)":
                return "UTC-1";
            case "Albania":
            case "Andorra":
            case "Austria":
            case "Belgium":
            case "Bosnia and Herzegovina":
            case "Croatia":
            case "Czech Republic":
            case "Denmark":
            case "France":
            case "Germany":
            case "Hungary":
            case "Italy":
            case "Kosovo":
            case "Liechtenstein":
            case "Luxembourg":
            case "Malta":
            case "Monaco":
            case "Montenegro":
            case "Netherlands":
            case "North Macedonia":
            case "Poland":
            case "San Marino":
            case "Serbia":
            case "Slovakia":
            case "Slovenia":
            case "Spain":
            case "Sweden":
            case "Switzerland":
            case "Vatican City":
                return "UTC+1";
            case "Finland":
            case "Estonia":
            case "Greece":
            case "Lithuania":
            case "Latvia":
            case "Moldova":
            case "Romania":
            case "Ukraine":
                return "UTC+2";
            case "Iceland":
                return "UTC+0";
            case "Ireland":
            case "Portugal":
            case "United Kingdom":
                return "UTC+0";
            case "Greenland (West)":
                return "UTC-3";
            case "Greenland (East)":
                return "UTC-1";
            case "Brazil (East)":
            case "Argentina":
            case "Uruguay":
            case "Chile":
            case "Falkland Islands":
                return "UTC-3";
            case "Bolivia":
            case "Venezuela":
            case "Guyana":
                return "UTC-4";
            case "Colombia":
            case "Ecuador":
            case "Jamaica":
            case "Panama":
            case "Peru":
                return "UTC-5";
            case "Belize":
            case "Costa Rica":
            case "El Salvador":
            case "Guatemala":
            case "Honduras":
                return "UTC-6";
            case "Canada (Newfoundland)":
                return "UTC-3:30";
            case "Canada (Atlantic)":
                return "UTC-4";
            case "Canada (Eastern)":
                return "UTC-5";
            case "Canada (Central)":
                return "UTC-6";
            case "Canada (Mountain)":
                return "UTC-7";
            case "Canada (Pacific)":
                return "UTC-8";
            case "United States (Eastern)":
            case "Haiti":
            case "Bahamas":
                return "UTC-5";
            case "United States (Central)":
                return "UTC-6";
            case "United States (Mountain)":
                return "UTC-7";
            case "United States (Pacific)":
                return "UTC-8";
            case "French Polynesia":
                return "UTC-10";
            case "New Zealand":
                return "UTC+12";
            default:
                return "Unknown Country";
        }
    }
    
}
