console.log('starbucks main.js파일');

const searchEl = document.querySelector('.search');
const searchInputEl = document.querySelector('input');

// class가 search로 박스를 클릭했을 경우 이벤트 등록
searchEl.addEventListener('click', function() {
    // searchInputEl에서 포커스 이벤트 발생
    searchInputEl.focus();
});

// tag가 input박스인 것에 focus 이벤트 등록
searchInputEl.addEventListener('focus', function() {
    searchEl.classList.add('focused');
    searchInputEl.setAttribute('placeholder', '통합검색');
});

// tag가 input박스인 것에 blur 이벤트 등록
searchInputEl.addEventListener('blur', function() {
    searchEl.classList.remove('focused');
    searchInputEl.setAttribute('placeholder', '');
});


/*
 * 페이지 스크롤에 따른 요소 제어

 * gsap사용법
 * gsap.to(요소, 지속시간, 옵션);
 *   ex) gsap.to('.to-top', .7, {opacity: 0});
*/
const badgeEl = document.querySelector('header .badges');
window.addEventListener('scroll', _.throttle(() => {
    console.log('scrollY:', window.scrollY);

    if (window.scrollY > 500) {
        // 배지 숨기기
        //badgeEl.style.display = 'none';
        gsap.to(badgeEl, .5, {opacity: 0, display: 'none'});
    } else {
        // 배지 보이기
        // badgeEl.style.display = 'block';
        gsap.to(badgeEl, .5, {opacity: 1, display: 'block'});
    }
}, 500));   // 500ms마다 이벤트 발생


// visual1에 대한 fade-in 효과
const fadeEls = document.querySelectorAll('.visual1 .fade-in');
fadeEls.forEach(function(fadeEl, index) {
    gsap.to(fadeEl, 1, {
        // delay값은 몇 초뒤에 실행할지 결정
        delay: (index + 1) * .7,   // 0.7, 1.4, 2.1, 2.8
        opacity: 1
    });
});

/**
 * swiper 사용법
 * new Swiper(선택자, 옵션) // 초기화
 */
// swiper 라이브러리 초기화

// 공지사항 swiper
const swiperNotice = new Swiper('.notice-line .swiper-container', {
    // Optional parameters
    direction: 'vertical',  // 수직 슬라이드
    loop: true, // 반복 재생 여부
    autoplay: {
        delay: 1000, // 1초마다 자동 재생
        disableOnInteraction: false, // 사용자가 슬라이드에 손을 대면 자동 재생을 멈추지 않음
    }, // 자동 재생 여부
});

// promotion swiper
const swiperPromotion = new Swiper('.promotion .swiper-container', {
    // Optional parameters
    // direction: 'horizontal',  // 수평 슬라이드
    slidesPerView: 3, // 한번에 보여줄 슬라이드 개수 (기본값은 1)
    spaceBetween: 10, // 슬리이드 사이 여백 
    centeredSlides: true, // 1번 슬라이드가 가운데 보이기
    loop: true, // 반복 재생 여부
    // autoplay: {
    //     delay: 5000, // 5초마다 자동 재생
    // }
    pagination: {
        el: '.promotion .swiper-pagination', // 페이지 번호 요소 선택자
        clickable: true, // 사용자의 페이지 번호 요소 제어 가능 여부
    },
    navigation: {
        prevEl: '.promotion .swiper-prev',
        nextEl: '.promotion .swiper-next',
    },
});  