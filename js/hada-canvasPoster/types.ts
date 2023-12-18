/**
 * 显示大小
 */
export interface ShowImage {
    width: number,
    height: number,
    showWidth: number,
    showHeight: number,
    zoom: number,
}



export interface NodeElement {
    resourceType: 'text' | 'image' | 'icon' | 'group',
    text?: string,
    d?: string,
    url?: string,
    name?: string,
    _urlMd5?: string,
    id: string,
    css: {
        top: number,
        left: number,
        /**
         * 动态位置
         */
        dynamicLocation: {
            offset:{
                top:number,
                left:number
            },
            direction: 'top' | 'bottom' | 'left' | 'right'
        },
        width?: number,
        maxWidth?: number,
        height?: number,
        opacity?: [0,1],
        mode?: 'scaleToFill' | 'aspectFit' | 'aspectFill' | 'widthFix' | 'heightFix',
        font?: string,
        /**
         * 字体大小
         */
        fontSize?: number,
        /**
         * 字体系列名
         */
        fontFamily?: string,
        color?: string,
        backgroundColor?: string,
        maxLine?: number,
        textOverflow?: string,
        borderWidth?: number,
        borderColor?: string,
        /**
         * 自定义形状 polygon(50% 0, 100% 50%, 50% 100%, 0 50%)
         * 如果设置， borderRadius 将不起作用
         */
        clipPath?: string,
        /**
         * 如果设置 polygon，将不起作用
         */
        borderRadius?: number,
        shadowOffsetX?: number,
        shadowOffsetY?: number,
        shadowBlur?: number,
        shadowColor?: string,
        angle?: number,
        lineSpacing?: number,
        textAlign?: 'center' | 'left' | 'right',
        zIndex?: number
    }
    width?: number,
    height?: number,
    children?: NodeElement[],
    clickStop?: boolean  // 是否阻止点击穿透
}


export interface Face {
    name: string,
    url: string
}

export interface DrawData {

    nodeElements: NodeElement[],
    width: number,
    height: number,
    faces?: Face[]

}
