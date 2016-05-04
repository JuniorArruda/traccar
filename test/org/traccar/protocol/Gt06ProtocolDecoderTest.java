package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTest;

public class Gt06ProtocolDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Gt06Protocol());

        verifyNothing(decoder, binary(
                "787805120099abec0d0a"));

        verifyNothing(decoder, binary(
                "78780D01086471700328358100093F040D0A"));

        verifyAttributes(decoder, binary(
                "78782d152500000000437574206f666620746865206675656c20737570706c793a2053756363657373210002013b898a0d0a"));

        verifyAttributes(decoder, binary(
                "787829152100000000526573746f7265206675656c20737570706c793a2053756363657373210002014077ce0d0a"));

        verifyNothing(decoder, binary(
                "78780D01012345678901234500018CDD0D0A"));

        verifyNothing(decoder, binary(
                "78780d0103534190360660610003c3df0d0a"));

        verifyAttributes(decoder, binary(
                "78780a13440604000201baaf540d0a"));

        verifyPosition(decoder, binary(
                "78781f120f0a140e150bc505e51e780293a9e800540000f601006e0055da00035f240d0a"),
                position("2015-10-20 14:21:11.000", true, 54.94535, 24.01762));

        verifyPosition(decoder, binary(
                "787823120f081b121d37cb01c8e2cc08afd3c020d50201940701d600a1190041ee100576d1470d0a"));

        verifyPosition(decoder, binary(
                "78781F120B081D112E10CC027AC7EB0C46584900148F01CC00287D001FB8000380810D0A"));

        verifyPosition(decoder, binary(
                "787819100B031A0B1B31CC027AC7FD0C4657BF0115210001001CC6070D0A"));

        verifyPosition(decoder, binary(
                "787821120C010C0F151FCF027AC8840C4657EC00140001CC00287D001F720001000F53A00D0A"));

        verifyPosition(decoder, binary(
                "787825160B051B093523CF027AC8360C4657B30014000901CC00266A001E1740050400020008D7B10D0A"));

        verifyPosition(decoder, binary(
                "787819100e010903230ec803ae32a60653cded00180000020072feb70d0a"));

        verifyPosition(decoder, binary(
                "7878471e0e03110b0511c501c664fd074db73f0218a602e003433a002fed40433a0056e14e433a0056104e433a0056fd53433a002eed55433a007e4b57433a002ee25aff00020120f6720d0a"));

        verifyNothing(decoder, binary(
                "7979005bfd0358899050927725004c0020bf984358df603b2ea3a339e54335013a5b56455253494f4e5d47543036445f32305f3630444d325f423235455f5631355f574d5b4255494c445d323031332f31322f32382031353a3234002a3b240d0a7979005bfd0358899050927725004c0020bf984358df603b2ea3a339e54335013a5b56455253494f4e5d47543036445f32305f3630444d325f423235455f5631355f574d5b4255494c445d323031332f31322f32382031353a3234002d4f9b0d0a7979005bfd0358899050927725004c0020bf984358df603b2ea3a339e54335013a5b56455253494f4e5d47543036445f32305f3630444d325f423235455f5631355f574d5b4255494c445d323031332f31322f32382031353a3234003084ff0d0a"));

        verifyNothing(decoder, binary(
                "78788b818300000000534545464e2626004f04220045042626262b37393035343031353534362626262626260410041b0415041a04210415041926262b373930363433333031313526260410043d044f26262b373936303437383430363426260412043e0432043026262b373932383834373738383126262626262626262626262626262626232300020022155d0d0a"));

        verifyPosition(decoder, binary(
                "787822220e0914160f07c9021a362805090a7800d8b802d402c30e00a98a0105010213f4bb0d0a"));

        verifyNothing(decoder, binary(
                "787811010864717003664467100f190a0002c6d20d0a"));

        verifyNothing(decoder, binary(
                "787811010123456789012345100B3201000171930D0A"));

    }

}
