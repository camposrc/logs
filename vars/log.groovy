#!/usr/bin/env groovy

def loadColors(){

    // 1 - Bold
    // 34 - Foreground Blue
    BLUE = '\033[1;34m'
    // 1 - Bold
    // 103 - Background Light yellow
    YELLOW = '\033[1;103m'
    // 1 - Bold
    // 97 - Foreground white
    // 101 - Background Light red
    RED = '\033[1;97;101m'

    // 0 - Reset all attributes
    NC = '\033[0m'

}

def info(msg){
    loadColors()
    echo "${BLUE}[ INFO] - $msg ${NC}"
}

def debug(msg){
    if(params.DEBUG_ENABLED){
        loadColors()
        echo "${YELLOW}[DEBUG] - $msg ${NC}"
    }
}


def error(msg){
    loadColors()
    echo "${RED}[ERROR] - $msg ${NC}"
}
