### Ϊʲô��Ƶ��վ����Ƶ���ӵ�ַ��blob��

�Դ�HTML5�ṩ��video��ǩ������ҳ�в�����Ƶ�Ѿ����һ���ǳ��򵥵��£�ֻҪһ��video��ǩ��src��������Ϊ��Ƶ�ĵ�ַ�������ˡ�����srcָ����ʵ����Ƶ�����ַ��������һ����վ��Դ�ļ�����ôͨ��referer���÷��������������õ���Ƶ�ĵ�ַ�������������ػ�ʹ�ã�ÿ�ηżٻؼң��ͻ����������Ұ�æ��һЩ��Ƶ��վ���¶�������
 Ŀǰ���ƴ洢�����̴󲿷ֶ�֧��referer����������ԭ������ڷ�����Դʱ������ͷ����Ϸ��������ҳ���ַ���ж��䲻���ڣ���ʾֱ�ӷ���ͼƬ��ַ�����ڰ������ڣ���Ϊ������
���Ǵ�ĳ��ʱ�俪ʼ���Ǵ򿪵��Թ���ȥ��������Ƶ��վ����Ƶsrc�ᷢ�֣�����ͳͳ�������������ʽ��


��bվ��һ����Ƶ����������е���Ƶ��ַ�����blob�Ǹ�ʲô��������
��ʵ���Blob URLҲ����ʲô�¼������������������һ�����ˣ��������ϵ���ص����²���Ҳ���Ǻ���ϸ������ͺʹ��һ�����ѧϰһ�¡�

#### Blob��ArrayBuffer

���������ݿ�ֱ����Blob���洢���������ݶ��������Ͳ��ù�ע�洢���ݵĸ�ʽ�ˡ���web����Blob�����ʾһ��ֻ��ԭʼ���ݵ����ļ�������Ȼ�Ƕ�����ԭʼ���ݵ��������ļ��Ķ�����˿���������ļ�����һ������Blob����
ArrayBuffer����������ʾͨ�õġ��̶����ȵ�ԭʼ���������ݻ����������ǿ���ͨ��new ArrayBuffer(length)�����һƬ�������ڴ�ռ䣬������ֱ�Ӷ�д�����ɸ�����Ҫ���䴫�ݵ�TypedArray��ͼ�� DataView ����������ԭʼ��������ʵ������ͼֻ�Ǹ����ṩ��һ��ĳ�����͵Ķ�д�ӿڣ�������Բ���ArrayBuffer������ݡ�TypedArray��ָ��һ��������������֤�����Ա����ͬһ���������ͣ���DataView�����Ա�����ǲ�ͬ���������͡�
TypedArray��ͼ������������������¼���:

Int8Array��8λ�з�������������1���ֽڡ�
Uint8Array��8λ�޷�������������1���ֽڡ�
Uint8ClampedArray��8λ�޷�������������1���ֽڣ��������ͬ��
Int16Array��16λ�з�������������2���ֽڡ�
Uint16Array��16λ�޷�������������2���ֽڡ�
Int32Array��32λ�з�������������4���ֽڡ�
Uint32Array��32λ�޷�������������4���ֽڡ�
Float32Array��32λ������������4���ֽڡ�
Float64Array��64λ������������8���ֽڡ�

Blob��ArrayBuffer�������ǣ�����ԭʼ�ֽ����������ṩ��mime type��ΪԪ���ݣ�Blob��ArrayBuffer֮����Խ���ת����
File������ʵ�̳���Blob���󣬲��ṩ���ṩ��name �� lastModifiedDate�� size ��type �Ȼ���Ԫ���ݡ�
����Blob����ת����ArrayBuffer��

```
//����һ���Զ��������ݴ洢��html�ļ�
const text = "<div>hello world</div>";
const blob = new Blob([text], { type: "text/html" }); // Blob?{size: 22, type: "text/html"}
//���ı���ȡ
const textReader = new FileReader();
textReader.readAsText(blob);
textReader.onload = function() {
  console.log(textReader.result); // <div>hello world</div>
};
//��ArrayBuffer��ʽ��ȡ
const bufReader = new FileReader();
bufReader.readAsArrayBuffer(blob);
bufReader.onload = function() {
  console.log(new Uint8Array(bufReader.result)); // Uint8Array(22)?[60, 100, 105, 118, 62, 104, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100, 60, 47, 100, 105, 118, 62]
};
```

����һ����ͬ���ݵ�ArrayBuffer����ת����Blob��

```
//����ֱ�Ӵ���һ��Uint8Array���������������
const u8Buf = new Uint8Array([60, 100, 105, 118, 62, 104, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100, 60, 47, 100, 105, 118, 62]);
const u8Blob = new Blob([u8Buf], { type: "text/html" }); // Blob?{size: 22, type: "text/html"}
const textReader = new FileReader();

textReader.readAsText(u8Blob);
textReader.onload = function() {
  console.log(textReader.result); // ͬ���õ�div>hello world</div>
};
���ƴ������Blob��ArrayBuffer��������ݿ��Բο���������ϣ�
```

MDN Blob
MDN ArrayBuffer
��һ��js��׼�ο��̶̳���������

#### URL.createObjectURL
video��ǩ��audio��ǩ����img��ǩ��src���ԣ����������·��������·��������һ�������ַ�������׶���ָ��һ���ļ���Դ�ĵ�ַ����Ȼ����֪����Blob��ʵ��һ�����Ե����ļ��õĶ��������ݣ���ôֻҪ���ǿ�������һ��ָ��Blob�ĵ�ַ���ǲ��ǾͿ���������Щ��ǩ��src�����ϣ��𰸿϶��ǿ��Եģ���������Ҫ�õ��ľ���URL.createObjectURL()��

```
const objectURL = URL.createObjectURL(object); //blob:http://localhost:1234/abcedfgh-1234-1234-1234-abcdefghijkl
```

�����object���������ڴ���URL��File����Blob ������� MediaSource �������ɵ����Ӿ�����blob:��ͷ��һ�ε�ַ����ʾָ�����һ�����������ݡ�
����localhost:1234�ǵ�ǰ��ҳ���������ƺͶ˿ںţ�Ҳ����location.host���������Blob URL�ǿ���ֱ�ӷ��ʵġ���Ҫע����ǣ���ʹ��ͬ���Ķ��������ݣ�ÿ����һ��URL.createObjectURL�������ͻ�õ�һ����һ����Blob URL�����URL�Ĵ���ʱ�䣬��ͬ����ҳ�Ĵ���ʱ�䣬һ����ҳˢ�»�ж�أ����Blob URL��ʧЧ��
ͨ��URL.revokeObjectURL(objectURL) �ͷ�һ��֮ǰ�Ѿ����ڵġ�ͨ������ URL.createObjectURL() ������ URL ���󡣵������ʹ��ĳ�� URL ����֮��Ӧ��ͨ����������������������֪���������ڴ��м�������������ļ���������,����ƽ̨�ں��ʵ�ʱ�����������ռ���

��������ļ�Э��򿪵�html�ļ�����urlΪfile://��ͷ�������ַ��http://localhost:1234����null�����Ҵ�ʱ���Blob URL���޷�ֱ�ӷ��ʵġ�

#### ʵսһ���ϴ�ͼƬԤ��
��ʱ����ͨ��input�ϴ�ͼƬ�ļ�֮ǰ����ϣ������Ԥ��һ��ͼƬ�����ʱ��Ϳ���ͨ��ǰ����ѧ���Ķ���ʵ�֣����ҷǳ��򵥡�

html

```
<input id="upload" type="file" />
<img id="preview" src="" alt="Ԥ��"/>
```
javascript

```
const upload = document.querySelector("#upload");
const preview = document.querySelector("#preview");

upload.onchange = function() {
  const file = upload.files[0]; //File����
  const src = URL.createObjectURL(file); 
  preview.src = src;
};

```
����һ��ͼƬ�ϴ�Ԥ����ʵ���ˣ�ͬ���������Ҳ�������ϴ���Ƶ��Ԥ����

#### ʵս������Blob URL����������Ƶ
����������һ��������Ƶ�ĵ�ַ����ô�ܽ������Ƶ��ַ���Blob URL����ʽ�أ�˼·�϶�����Ҫ�õ��洢�����Ƶԭʼ���ݵ�Blob���󣬵��ǲ�ͬ��input�ϴ�����ֱ���õ�File��������ֻ��һ�������ַ��
����֪��ƽʱ����ӿ����ǿ���ʹ��xhr��jquery���ajax��axios���Ƿ�װ���������fetch������һ������˵�ַ���Է���������Ӧ�����ݣ������������xhr����fetchȥ����һ��ͼƬ����Ƶ��ַ�᷵��ʲô�أ���Ȼ�Ƿ���ͼƬ����Ƶ�����ݣ�ֻ����Ҫ������ȷresponseType�����õ�������Ҫ�ĸ�ʽ���ݡ�

```
function ajax(url, cb) {
  const xhr = new XMLHttpRequest();
  xhr.open("get", url);
  xhr.responseType = "blob"; // ""|"text"-�ַ��� "blob"-Blob���� "arraybuffer"-ArrayBuffer����
  xhr.onload = function() {
    cb(xhr.response);
  };
  xhr.send();
}
```

ע��XMLHttpRequest��Fetch API������п������⣬����ͨ��������Դ����(CORS)�����
����responseType��������blob��arraybuffer����Ӧ�þ������ˣ����󷵻�һ��Blob���󣬻��߷���ArrayBuffer����ת����Blob����Ȼ��ͨ��createObjectURL���ɵ�ַ��ֵ����Ƶ��src���ԾͿ�����,��������ֱ������һ��Blob����

```
ajax('video.mp4', function(res){
    const src = URL.createObjectURL(res); 
    video.src = src;
})
```

�õ��Թ��߲鿴��Ƶ��ǩ��src�����Ѿ����һ��Blob URL�������Ͽ������ǲ��Ǻ͸�����Ƶ��վ��ʽһ���ˣ����ǿ���һ�����⣬������ʽҪ�ȵ�������ȫ����Ƶ���ݲ��ܲ��ţ�С��Ƶ����˵��Ҫ����Ƶ��Դ��һ���񲻱�ը����Ȼ������Ƶ��վ��������ô�ɡ�
����������ķ���������ý�壬�����������ֱ���������ʹý���ļ����Ա��±߲�������������90������������ᵽ��ý��ô���Ӧ����Դ���ǿ����ͷ�Ĳ���������web�����Ҫʹ����ý�壬�ж����ý��Э����Թ�����ѡ��

#### HLS��MPEG DASH
HLS ��HTTP Live Streaming��, ���� Apple ��˾ʵ�ֵĻ��� HTTP ��ý��������Э�顣HLS��tsΪ�����ʽ��m3u8Ϊ�����ļ����ļ��а�������Ҫ�õ���ts�ļ����ƣ�ʱ������Ϣ�������ò��������ţ�Ҳ������vscode֮��ı༭���򿪲鿴�������ƶ��˴󲿷��������֧�֣�Ҳ����˵�������video��ǩֱ�Ӽ���һ��m3u8�ļ�������Ƶ����ֱ����������pc�ˣ�����ƻ����Safari����Ҫ�������֧�֡�
�õ��˷�������Ƶ��վ�����ſᣬ��������Ƶ����ʱͨ�����Բ鿴Network���xhr���󣬻ᷢ��һ��m3u8�ļ�����ÿ��һ��ʱ�����󼸸�ts�ļ���

���ǳ���HLS������Adobe��HDS��΢���MSS������һ���Ҫ�и���׼��Ķ��������Ǿ�����MPEG DASH��
DASH��Dynamic Adaptive Streaming over HTTP�� ����һ���ڻ������ϴ��Ͷ�̬���ʵ�Video Streaming������������ƻ����HLS��DASH��ͨ��media presentation description (MPD)����Ƶ������Ƭ��һ���̵ܶ��ļ�Ƭ�Σ�ÿ����Ƭ���ж����ͬ�����ʣ�DASH Client���Ը�����������ѡ��һ�����ʽ��в��ţ�֧���ڲ�ͬ����֮���޷��л���
Youtube��Bվ�����õ����������������������ļ�ͨ����mpd�ļ�������HLS��m3u8�ļ����ܣ��������ʽ�Ƽ�����fmp4��Fragmented MP4��,�ļ���չ��ͨ��Ϊ.m4s��ֱ����.mp4�������õ��Բ鿴bվ��Ƶ����ʱ���������󣬻ᷢ��ÿ��һ��ʱ���м���m4s�ļ�����

������HLS����DASH�ǣ����ж�Ӧ�Ŀ������Ǹ߼��Ĳ�������������ʹ�ã���������ʵ����Ҫѧϰһ��ʵ�֡���ʵ�׿��������ļ��Ľ����õ�ʵ��ý���ļ��Ĵ����ַ������������ǰ��ֻ��һ����ν������Ƶ���ݺϲ���video��ǩ�����޷첥�š�

��֮��ص�һƪBվ�����Ƽ�������Ȥ�����ѣ�����Ϊʲôʹ��DASH

#### MediaSource

video��ǩsrcָ��һ����Ƶ��ַ����Ƶ�������ٽ�src�޸�Ϊ��һ�ε���Ƶ��ַȻ�󲥷ţ�����Ȼ�����������޷첥�ŵ�Ҫ����ʵ��������ǰ��Blob URL��ѧϰ�����ǿ��ܾͻ��뵽һ��˼·����Blob URLָ��һ����Ƶ���������ݣ�Ȼ�󲻶Ͻ���һ����Ƶ�Ķ������������ƴ�ӽ�ȥ�������Ϳ����ڲ�Ӱ�첥�ŵ�����£����ϵĸ�����Ƶ���ݲ�������ȥ�������ǲ����е�������˼�����ˡ�
Ҫʵ�������������Ҫͨ��MediaSource��ʵ�֣�MediaSource�ӿڹ���Ҳ�ܴ��⣬��Ϊһ��ý�������������Ժ�HTMLMediaElement���а󶨡��������̾���ͨ��URL.createObjectURL����������BLob URL�����õ�video��ǩ��src�ϣ��ڲ��Ź����У�������Ȼ����ͨ��MediaSource.appendBuffer������������������ݣ��ﵽ������Ƶ���ݵ�Ŀ�ġ�
ʵ�ִ������£�

```
const video = document.querySelector('video');
//��Ƶ��Դ���·��������������5���ֶ���Ƶ video1.mp4 ~ video5.mp4����һ����Ϊ��ʼ����Ƶinit.mp4
const assetURL = "http://www.demo.com";
//��Ƶ��ʽ�ͱ�����Ϣ����ҪΪ�ж�������Ƿ�֧����Ƶ��ʽ���������Ϣ����Ƶ�������ܻᱨ��
const mimeCodec = 'video/mp4; codecs="avc1.42E01E, mp4a.40.2"'; 
if ('MediaSource' in window && MediaSource.isTypeSupported(mimeCodec)) {
  const mediaSource = new MediaSource();
  video.src = URL.createObjectURL(mediaSource); //��video��MediaSource�󶨣��˴�����һ��Blob URL
  mediaSource.addEventListener('sourceopen', sourceOpen); //�������Ϊ������
} else {
  //�������֧�ָ���Ƶ��ʽ
  console.error('Unsupported MIME type or codec: ', mimeCodec);
}

function sourceOpen () {
  const mediaSource = this;
  const sourceBuffer = mediaSource.addSourceBuffer(mimeCodec);
  let i = 1;
  function getNextVideo(url) {
    //ajax����ʵ�ַ������ģ�������������Ϊarraybuffer
    ajax(url, function(buf) {
      //��������������󵽵����ݣ�����Ӱ�쵱�µ���Ƶ���š�
      sourceBuffer.appendBuffer(buf);
    });
  }
  //ÿ��appendBuffer���ݸ�����֮��ͻᴥ��
  sourceBuffer.addEventListener("updateend", function() {
    if (i === 1) {
      //��һ����ʼ����Ƶ������Ϳ�ʼ����
      video.play();
    }
    if (i < 6) {
      //һ����Ƶ������ɺ�������һ����Ƶ
      getNextVideo(`${assetURL}/video${i}.mp4`);
    }
    if (i === 6) {
      //ȫ����ƵƬ�μ�����ر�����
      mediaSource.endOfStream();
      URL.revokeObjectURL(video.src); //Blob URL�Ѿ�ʹ�ò����أ�����Ҫ�ٴ�ʹ�õĻ������ͷŵ���
    }
    i++;
  });
  //���س�ʼ��Ƶ
  getNextVideo(`${assetURL}/init.mp4`);
};


```

��δ����޸���MDN��MediaSource�����е�ʾ�����룬ԭ������ֻ�м���һ����Ƶ�����޸�Ϊ�˶����Ƶ����������ܶ�ط��������Ż���������û���͵���Ϊ�˷������ǿ��߼���
��ʱ�����Ѿ�����ʵ����һ�����׵���ý�岥�Ź��ܣ����Ը������ټ���m3u8��mpd�ļ��Ľ��������һ��UI���棬�Ϳ���ʵ��һ����ý�岥�����ˡ�
�����һ��һ���ӣ��ܶ�������MDN��MediaSourceʾ�����룬���ܻᷢ��ʹ�ùٷ��ṩ����Ƶ��û����ģ����������Լ���mp4��Ƶ�ͻᱨ��������Ϊfmp4�ļ���չ��ͨ��Ϊ.m4s��ֱ����.mp4����ȴ�������mp4�ļ���

#### Fragmented MP4

ͨ������ʹ�õ�mp4�ļ���Ƕ�׽ṹ�ģ��ͻ��˱���Ҫ��ͷ����һ�� MP4 �ļ������ܹ��������ţ����ܴ��м�һ�ο�ʼ���š���Fragmented MP4�����fmp4������������������Ƭmp4������һϵ�е�Ƭ����ɣ����������֧�� byte-range ������ô����ЩƬ�ο��Զ����Ľ������󵽿ͻ��˽��в��ţ�������Ҫ���������ļ���
���ǿ���ͨ�������վ�ж�һ��mp4�ļ��Ƿ�ΪFragmented MP4����վ��ַ��
����ͨ��FFmpeg��Bento4��mp4fragment������ͨmp4ת��ΪFragmented MP4���������߶��������й��ߣ����ո���ϵͳ����������Ӧ��ѹ��������ѹ�����û�������ָ���ļ����е�binĿ¼���Ϳ���ʹ����������ˡ�
Bento4��mp4fragment��û��̫���������������:

```
mp4fragment video.mp4 video-fragmented.mp4
```

FFmpeg����Ҫ����һЩ�������������£�

```
ffmpeg -i video.mp4 -movflags empty_moov+default_base_moof+frag_keyframe video-fragmented.mp4
```

Tips�����ϴ󲿷ֵ�������ת��ʱ�ǲ���default_base_moof��������ģ���Ȼ����ת���ɹ������Ǿ������������Ӵ˲�����ҳ��MediaSource������Ƶʱ�ᱨ��

��Ƶ���и�ֶο���ʹ��Bento4��mp4slipt���������£�

```
mp4split video.mp4 --media-segment video-%llu.mp4 --pattern-parameters N
```
#### ���

֮����д��ƪ������ʵ��֮ǰ��˾�и�����Ҫ�˽�һ��Blob URL����΢����һ�£�����������֮�����æ��͵����ʰ���������������һ��ѧϰһ�߼�¼����ƪ�����еĺܶ��չ������ʵ�кܶ����ݣ�ϣ����ҿ�����ƪ�����ܹ�����������������Ȥ���ҵ�Ŀ��Ҳ�ʹﵽ�ˣ�������Ƶ�ⷽ��Ķ���������е���ģ�����������д������©Ҳ��ӭ���ָ�����ҽ���ʱ������
