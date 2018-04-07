/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CashClearingSystemCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specification of a pre-agreed offering between clearing agents or the channel
 * through which the payment instruction is to be processed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#EBAEuro1Step1
 * CashClearingSystemCode.EBAEuro1Step1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Austrian
 * CashClearingSystemCode.Austrian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#NewZealand
 * CashClearingSystemCode.NewZealand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Azerbaijan
 * CashClearingSystemCode.Azerbaijan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#BosniaHerzegovina
 * CashClearingSystemCode.BosniaHerzegovina}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Belgium
 * CashClearingSystemCode.Belgium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Finland
 * CashClearingSystemCode.Finland}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Italy
 * CashClearingSystemCode.Italy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Canada
 * CashClearingSystemCode.Canada}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#SpainCAM
 * CashClearingSystemCode.SpainCAM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Ireland
 * CashClearingSystemCode.Ireland}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#UnitedKingdom
 * CashClearingSystemCode.UnitedKingdom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Denmark
 * CashClearingSystemCode.Denmark}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#GermanyRTGSPlus
 * CashClearingSystemCode.GermanyRTGSPlus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#EBAEuro1
 * CashClearingSystemCode.EBAEuro1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#GermanyELS
 * CashClearingSystemCode.GermanyELS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#EBAStep1
 * CashClearingSystemCode.EBAStep1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#EBAStep2
 * CashClearingSystemCode.EBAStep2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Croatia
 * CashClearingSystemCode.Croatia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Greece
 * CashClearingSystemCode.Greece}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Hungary
 * CashClearingSystemCode.Hungary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Luxemburg
 * CashClearingSystemCode.Luxemburg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Latvia
 * CashClearingSystemCode.Latvia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#SouthAfrica
 * CashClearingSystemCode.SouthAfrica}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Mauritius
 * CashClearingSystemCode.Mauritius}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Norway
 * CashClearingSystemCode.Norway}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Switzerland
 * CashClearingSystemCode.Switzerland}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Australia
 * CashClearingSystemCode.Australia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Egypt
 * CashClearingSystemCode.Egypt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#FrancePNS
 * CashClearingSystemCode.FrancePNS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Venezuela
 * CashClearingSystemCode.Venezuela}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#SwedenSEC
 * CashClearingSystemCode.SwedenSEC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Slovania
 * CashClearingSystemCode.Slovania}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#SpainES
 * CashClearingSystemCode.SpainES}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Portugal
 * CashClearingSystemCode.Portugal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#SwedenSSK
 * CashClearingSystemCode.SwedenSSK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#FranceFR
 * CashClearingSystemCode.FranceFR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Target
 * CashClearingSystemCode.Target}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Netherlands
 * CashClearingSystemCode.Netherlands}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Fedwire
 * CashClearingSystemCode.Fedwire}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#BankOfJapanNet
 * CashClearingSystemCode.BankOfJapanNet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#ForeignExchangeYenClearing
 * CashClearingSystemCode.ForeignExchangeYenClearing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Zengin
 * CashClearingSystemCode.Zengin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#RTGS
 * CashClearingSystemCode.RTGS}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#ACH
 * CashClearingSystemCode.ACH}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#USChips
 * CashClearingSystemCode.USChips}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#FedNet
 * CashClearingSystemCode.FedNet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#DenmarkDDK
 * CashClearingSystemCode.DenmarkDDK}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Albania
 * CashClearingSystemCode.Albania}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#SwedenBGC
 * CashClearingSystemCode.SwedenBGC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Barbados
 * CashClearingSystemCode.Barbados}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Bulgaria
 * CashClearingSystemCode.Bulgaria}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Bahamas
 * CashClearingSystemCode.Bahamas}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Botswana
 * CashClearingSystemCode.Botswana}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Philippines
 * CashClearingSystemCode.Philippines}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#ECB
 * CashClearingSystemCode.ECB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#USChipsACH
 * CashClearingSystemCode.USChipsACH}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#USFedACH
 * CashClearingSystemCode.USFedACH}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Ghana
 * CashClearingSystemCode.Ghana}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#NetherlandsIP
 * CashClearingSystemCode.NetherlandsIP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Jordan
 * CashClearingSystemCode.Jordan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Kenya
 * CashClearingSystemCode.Kenya}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#SriLanka
 * CashClearingSystemCode.SriLanka}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Singapore
 * CashClearingSystemCode.Singapore}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Malta
 * CashClearingSystemCode.Malta}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Namibia
 * CashClearingSystemCode.Namibia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Angola
 * CashClearingSystemCode.Angola}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#RomaniaEPO
 * CashClearingSystemCode.RomaniaEPO}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#RomaniaGSRS
 * CashClearingSystemCode.RomaniaGSRS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Chili
 * CashClearingSystemCode.Chili}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#UnitedKingdomGBP
 * CashClearingSystemCode.UnitedKingdomGBP}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Thailand
 * CashClearingSystemCode.Thailand}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Tanzania
 * CashClearingSystemCode.Tanzania}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#TrinidadAndTobago
 * CashClearingSystemCode.TrinidadAndTobago}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Uganda
 * CashClearingSystemCode.Uganda}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Zimbabwe
 * CashClearingSystemCode.Zimbabwe}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Zambia
 * CashClearingSystemCode.Zambia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode#Columbia
 * CashClearingSystemCode.Columbia}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ABE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashClearingSystemCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is to be processed."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CashClearingSystemCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Scheme code for EBA Euro1/Step1.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ABE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EBAEuro1Step1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for EBA Euro1/Step1."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode EBAEuro1Step1 = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EBAEuro1Step1";
			definition = "Scheme code for EBA Euro1/Step1.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "ABE";
		}
	};
	/**
	 * Scheme code for AT (Austria) - Austrian RTGS (ARTIS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Austrian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for AT (Austria) - Austrian RTGS (ARTIS)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Austrian = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Austrian";
			definition = "Scheme code for AT (Austria) - Austrian RTGS (ARTIS).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "ART";
		}
	};
	/**
	 * Scheme code for NZ (New Zealand) - New Zealand Assured Value Payments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AVP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewZealand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for NZ (New Zealand) - New Zealand Assured Value Payments."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode NewZealand = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewZealand";
			definition = "Scheme code for NZ (New Zealand) - New Zealand Assured Value Payments.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "AVP";
		}
	};
	/**
	 * Scheme code for AZ (Azerbaijan) - Azerbaijan Interbank Payment System
	 * (AZIPS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AZM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Azerbaijan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for AZ (Azerbaijan) - Azerbaijan Interbank Payment System (AZIPS)."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Azerbaijan = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Azerbaijan";
			definition = "Scheme code for AZ (Azerbaijan) - Azerbaijan Interbank Payment System (AZIPS).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "AZM";
		}
	};
	/**
	 * Scheme code for BA (Bosnia and Herzegovina).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BosniaHerzegovina"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for BA (Bosnia and Herzegovina)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode BosniaHerzegovina = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BosniaHerzegovina";
			definition = "Scheme code for BA (Bosnia and Herzegovina).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "BAP";
		}
	};
	/**
	 * Scheme code for BE (Belgium) - Belgium RTGS (ELLIPS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Belgium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for BE (Belgium) - Belgium RTGS (ELLIPS)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Belgium = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Belgium";
			definition = "Scheme code for BE (Belgium) - Belgium RTGS (ELLIPS).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "BEL";
		}
	};
	/**
	 * Scheme code for FI (Finland) - RTGS (BOF).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Finland"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for FI (Finland) - RTGS (BOF)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Finland = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Finland";
			definition = "Scheme code for FI (Finland) - RTGS (BOF).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "BOF";
		}
	};
	/**
	 * Scheme code for IT (Italy) - Italy RTGS (BIREL).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Italy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for IT (Italy) - Italy RTGS (BIREL)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Italy = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Italy";
			definition = "Scheme code for IT (Italy) - Italy RTGS (BIREL).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "BRL";
		}
	};
	/**
	 * Scheme code for CA (Canada) - Canadian Large Value Transfer System
	 * (LVTS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Canada"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for CA (Canada) - Canadian Large Value Transfer System (LVTS)."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Canada = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Canada";
			definition = "Scheme code for CA (Canada) - Canadian Large Value Transfer System (LVTS).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "CAD";
		}
	};
	/**
	 * Scheme code for ES (Spain).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpainCAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for ES (Spain)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode SpainCAM = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpainCAM";
			definition = "Scheme code for ES (Spain).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "CAM";
		}
	};
	/**
	 * Scheme code for IE (Ireland) - Irish RTGS (IRIS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CBJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ireland"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for IE (Ireland) - Irish RTGS (IRIS)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Ireland = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ireland";
			definition = "Scheme code for IE (Ireland) - Irish RTGS (IRIS).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "CBJ";
		}
	};
	/**
	 * Scheme code for GB (UK) - British Euro RTGS (CHAPS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitedKingdom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for GB (UK) - British Euro RTGS (CHAPS)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode UnitedKingdom = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitedKingdom";
			definition = "Scheme code for GB (UK) - British Euro RTGS (CHAPS).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "CHP";
		}
	};
	/**
	 * Scheme code for DK (Denmark) - Danish Euro RTGS (KRONOS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DKC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denmark"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for DK (Denmark) - Danish Euro RTGS (KRONOS)."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Denmark = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Denmark";
			definition = "Scheme code for DK (Denmark) - Danish Euro RTGS (KRONOS).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "DKC";
		}
	};
	/**
	 * Scheme code for DE (Germany).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanyRTGSPlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for DE (Germany)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode GermanyRTGSPlus = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GermanyRTGSPlus";
			definition = "Scheme code for DE (Germany).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "RTP";
		}
	};
	/**
	 * Scheme code for EBA Euro1.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EBAEuro1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for EBA Euro1."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode EBAEuro1 = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EBAEuro1";
			definition = "Scheme code for EBA Euro1.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "EBA";
		}
	};
	/**
	 * Scheme code for DE (Germany).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanyELS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for DE (Germany)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode GermanyELS = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GermanyELS";
			definition = "Scheme code for DE (Germany).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "ELS";
		}
	};
	/**
	 * Scheme code for EBA step 1 (members).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EBAStep1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for EBA step 1 (members)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode EBAStep1 = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EBAStep1";
			definition = "Scheme code for EBA step 1 (members).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "ERP";
		}
	};
	/**
	 * Scheme code for EBA step 2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EBAStep2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for EBA step 2."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode EBAStep2 = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EBAStep2";
			definition = "Scheme code for EBA step 2.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "XCT";
		}
	};
	/**
	 * Scheme code for HR (Croatia) - HSVP.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HRK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Croatia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for HR (Croatia) - HSVP."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Croatia = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Croatia";
			definition = "Scheme code for HR (Croatia) - HSVP.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "HRK";
		}
	};
	/**
	 * Scheme code for GR (Greece) - Greek RTGS (HERMES).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HRM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Greece"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for GR (Greece) - Greek RTGS (HERMES)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Greece = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Greece";
			definition = "Scheme code for GR (Greece) - Greek RTGS (HERMES).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "HRM";
		}
	};
	/**
	 * Scheme code for HU (Hungary) - VIBER.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HUF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hungary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for HU (Hungary) - VIBER."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Hungary = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Hungary";
			definition = "Scheme code for HU (Hungary) - VIBER.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "HUF";
		}
	};
	/**
	 * Scheme code for LU (Luxemburg) - Luxembourg RTGS (LIPS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Luxemburg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for LU (Luxemburg) - Luxembourg RTGS (LIPS)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Luxemburg = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Luxemburg";
			definition = "Scheme code for LU (Luxemburg) - Luxembourg RTGS (LIPS).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "LGS";
		}
	};
	/**
	 * Scheme code for LV (Latvia).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LVL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Latvia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for LV (Latvia)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Latvia = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Latvia";
			definition = "Scheme code for LV (Latvia).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "LVL";
		}
	};
	/**
	 * Scheme code for ZA (South Africa) - South-African Multiple Option
	 * Settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SouthAfrica"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for ZA (South Africa) - South-African Multiple Option Settlement."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode SouthAfrica = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SouthAfrica";
			definition = "Scheme code for ZA (South Africa) - South-African Multiple Option Settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "MOS";
		}
	};
	/**
	 * Scheme code for MU (Mauritius).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mauritius"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for MU (Mauritius)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Mauritius = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mauritius";
			definition = "Scheme code for MU (Mauritius).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "MUP";
		}
	};
	/**
	 * Scheme code for NO (Norway).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Norway"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for NO (Norway)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Norway = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Norway";
			definition = "Scheme code for NO (Norway).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "NOC";
		}
	};
	/**
	 * Scheme code for CH (Switzerland).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Switzerland"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for CH (Switzerland)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Switzerland = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Switzerland";
			definition = "Scheme code for CH (Switzerland).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "PCH";
		}
	};
	/**
	 * Scheme code for AU (Australia).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Australia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for AU (Australia)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Australia = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Australia";
			definition = "Scheme code for AU (Australia).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "PDS";
		}
	};
	/**
	 * Scheme code for EG (Egypt).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Egypt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for EG (Egypt)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Egypt = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Egypt";
			definition = "Scheme code for EG (Egypt).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "PEG";
		}
	};
	/**
	 * Scheme code for FR (France).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrancePNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for FR (France)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode FrancePNS = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FrancePNS";
			definition = "Scheme code for FR (France).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "PNS";
		}
	};
	/**
	 * Scheme code for Ve (Venezuela).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Venezuela"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for Ve (Venezuela)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Venezuela = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Venezuela";
			definition = "Scheme code for Ve (Venezuela).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "PVE";
		}
	};
	/**
	 * Scheme code for SE (Sweden) - Swedish Euro RTGS (SEC).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwedenSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for SE (Sweden) - Swedish Euro RTGS (SEC)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode SwedenSEC = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwedenSEC";
			definition = "Scheme code for SE (Sweden) - Swedish Euro RTGS (SEC).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "SEC";
		}
	};
	/**
	 * Scheme code for SI (Slovenia).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Slovania"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for SI (Slovenia)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Slovania = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Slovania";
			definition = "Scheme code for SI (Slovenia).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "SIT";
		}
	};
	/**
	 * Scheme code for ES (Spain) - Spanish RTGS (SLBE).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpainES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for ES (Spain) - Spanish RTGS (SLBE)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode SpainES = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpainES";
			definition = "Scheme code for ES (Spain) - Spanish RTGS (SLBE).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "SLB";
		}
	};
	/**
	 * Scheme code for PT (Portugal) - Portuguese RTGS (SPGT).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Portugal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for PT (Portugal) - Portuguese RTGS (SPGT)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Portugal = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Portugal";
			definition = "Scheme code for PT (Portugal) - Portuguese RTGS (SPGT).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "SPG";
		}
	};
	/**
	 * Scheme code for SE (Sweden) - SEK RTGS (RIX).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwedenSSK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for SE (Sweden) - SEK RTGS (RIX)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode SwedenSSK = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwedenSSK";
			definition = "Scheme code for SE (Sweden) - SEK RTGS (RIX).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "SSK";
		}
	};
	/**
	 * Scheme code for FR (France) - French RTGS (TBF).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TBF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FranceFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for FR (France) - French RTGS (TBF)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode FranceFR = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FranceFR";
			definition = "Scheme code for FR (France) - French RTGS (TBF).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "TBF";
		}
	};
	/**
	 * Scheme code for Target.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Target"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for Target."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Target = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Target";
			definition = "Scheme code for Target.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "TGT";
		}
	};
	/**
	 * Scheme code for NL (Netherlands) - Dutch RTGS (TOP).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netherlands"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for NL (Netherlands) - Dutch RTGS (TOP)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Netherlands = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netherlands";
			definition = "Scheme code for NL (Netherlands) - Dutch RTGS (TOP).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "TOP";
		}
	};
	/**
	 * Scheme code for the US national real time gross settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fedwire"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for the US national real time gross settlement system."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Fedwire = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Fedwire";
			definition = "Scheme code for the US national real time gross settlement system.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "FDW";
		}
	};
	/**
	 * Scheme code for the Bank of Japan clearing system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankOfJapanNet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for the Bank of Japan clearing system."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode BankOfJapanNet = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BankOfJapanNet";
			definition = "Scheme code for the Bank of Japan clearing system.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "BOJ";
		}
	};
	/**
	 * Scheme code for the Foreign Exchange Yen Clearing system (FEYCS). It is
	 * the Japanese electronic interbank system for sending guaranteed and
	 * unconditional yen payments of FX deals for same day settlement from one
	 * settlement bank, on behalf of itself or its customers, to another
	 * settlement bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeYenClearing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for the Foreign Exchange Yen Clearing system (FEYCS). It is the Japanese electronic interbank system for sending guaranteed and unconditional yen payments of FX deals for same day settlement from one settlement bank, on behalf of itself or its customers, to another settlement bank."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode ForeignExchangeYenClearing = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForeignExchangeYenClearing";
			definition = "Scheme code for the Foreign Exchange Yen Clearing system (FEYCS). It is the Japanese electronic interbank system for sending guaranteed and unconditional yen payments of FX deals for same day settlement from one settlement bank, on behalf of itself or its customers, to another settlement bank.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "FEY";
		}
	};
	/**
	 * Scheme code for the Zengin system. The electronic payment system for
	 * domestic third party transfers managed by the Tokyo Bankers Association.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Zengin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for the Zengin system. The electronic payment system for domestic third party transfers managed by the Tokyo Bankers Association."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Zengin = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Zengin";
			definition = "Scheme code for the Zengin system. The electronic payment system for domestic third party transfers managed by the Tokyo Bankers Association.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "ZEN";
		}
	};
	/**
	 * Real Time Gross Settlement System. Payment system that simultaneously
	 * clears individual transfers and settles them in central bank money.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Real Time Gross Settlement System. Payment system that simultaneously clears individual transfers and settles them in central bank money."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode RTGS = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RTGS";
			definition = "Real Time Gross Settlement System. Payment system that simultaneously clears individual transfers and settles them in central bank money.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "RTG";
		}
	};
	/**
	 * Automated Clearing House. Payment system that clears cash transfers and
	 * settles the proceeds in a lump sum, usually on a multilateral netting
	 * basis.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ACH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Automated Clearing House. Payment system that clears cash transfers and settles the proceeds in a lump sum, usually on a multilateral netting basis."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode ACH = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ACH";
			definition = "Automated Clearing House. Payment system that clears cash transfers and settles the proceeds in a lump sum, usually on a multilateral netting basis.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "ACH";
		}
	};
	/**
	 * CHIPS is the Clearing House Interbank Payment System in the US.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USChips"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CHIPS is the Clearing House Interbank Payment System in the US."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode USChips = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USChips";
			definition = "CHIPS is the Clearing House Interbank Payment System in the US.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "CHI";
		}
	};
	/**
	 * FedNet is a link to a Federal Bank account via the internet. FedNet
	 * enables checking of account balance, transactions, take print outs of
	 * account statement, transfer funds to third party accounts, E-shopping,
	 * BSNL Payments, Deposit opening, Deposit Renewal, Request for Demand
	 * Draft, Cheque Book etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FedNet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "FedNet is a link to a Federal Bank account via the internet. FedNet enables checking of account balance, transactions, take print outs of account statement, transfer funds to third party accounts, E-shopping, BSNL Payments, Deposit opening, Deposit Renewal, Request for Demand Draft, Cheque Book etc."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode FedNet = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FedNet";
			definition = "FedNet is a link to a Federal Bank account via the internet. FedNet enables checking of account balance, transactions, take print outs of account statement, transfer funds to third party accounts, E-shopping, BSNL Payments, Deposit opening, Deposit Renewal, Request for Demand Draft, Cheque Book etc.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "FDN";
		}
	};
	/**
	 * Scheme code for DK (Denmark) - Danish Krone RTGS (KRONOS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DenmarkDDK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for DK (Denmark) - Danish Krone RTGS (KRONOS)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode DenmarkDDK = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DenmarkDDK";
			definition = "Scheme code for DK (Denmark) - Danish Krone RTGS (KRONOS).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "DDK";
		}
	};
	/**
	 * Scheme code for AL (Albania) - Albania Interbank Payment System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Albania"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for AL (Albania) - Albania Interbank Payment System."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Albania = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Albania";
			definition = "Scheme code for AL (Albania) - Albania Interbank Payment System.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "AIP";
		}
	};
	/**
	 * Scheme code for SE (Sweden) - Sweden BGC Clearing CUG.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SwedenBGC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for SE (Sweden) - Sweden BGC Clearing CUG."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode SwedenBGC = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SwedenBGC";
			definition = "Scheme code for SE (Sweden) - Sweden BGC Clearing CUG.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "BCC";
		}
	};
	/**
	 * Scheme code for BB (Barbados) - Barbados RTGS (CBRTGS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Barbados"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for BB (Barbados) - Barbados RTGS (CBRTGS)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Barbados = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Barbados";
			definition = "Scheme code for BB (Barbados) - Barbados RTGS (CBRTGS).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "BDS";
		}
	};
	/**
	 * Scheme code for BG (Bulgaria) - Bulgaria RTGS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bulgaria"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for BG (Bulgaria) - Bulgaria RTGS."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Bulgaria = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bulgaria";
			definition = "Scheme code for BG (Bulgaria) - Bulgaria RTGS.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "BGN";
		}
	};
	/**
	 * Scheme code for BS (Bahamas) - Bahamas RTGS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BHS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bahamas"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for BS (Bahamas) - Bahamas RTGS."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Bahamas = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bahamas";
			definition = "Scheme code for BS (Bahamas) - Bahamas RTGS.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "BHS";
		}
	};
	/**
	 * Scheme code for BW (Botswana) - Botswana Interbank Settlement System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Botswana"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for BW (Botswana) - Botswana Interbank Settlement System."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Botswana = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Botswana";
			definition = "Scheme code for BW (Botswana) - Botswana Interbank Settlement System.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "BIS";
		}
	};
	/**
	 * Scheme code for PH (Philippines) - Philippines Payment System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Philippines"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for PH (Philippines) - Philippines Payment System."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Philippines = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Philippines";
			definition = "Scheme code for PH (Philippines) - Philippines Payment System.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "BSP";
		}
	};
	/**
	 * Scheme code for ECB (European Central Bank) - ECB Payment Mechanism.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EPM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ECB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for ECB (European Central Bank) - ECB Payment Mechanism."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode ECB = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ECB";
			definition = "Scheme code for ECB (European Central Bank) - ECB Payment Mechanism.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "EPM";
		}
	};
	/**
	 * Scheme code for the US CHIPS-ACH.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EPN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USChipsACH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for the US CHIPS-ACH."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode USChipsACH = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USChipsACH";
			definition = "Scheme code for the US CHIPS-ACH.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "EPN";
		}
	};
	/**
	 * Scheme code for the US FED-ACH.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USFedACH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for the US FED-ACH."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode USFedACH = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "USFedACH";
			definition = "Scheme code for the US FED-ACH.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "FDA";
		}
	};
	/**
	 * Scheme code for GH (Ghana) - Ghana Interbank Settlement System (GISS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ghana"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for GH (Ghana) - Ghana Interbank Settlement System (GISS)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Ghana = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ghana";
			definition = "Scheme code for GH (Ghana) - Ghana Interbank Settlement System (GISS).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "GIS";
		}
	};
	/**
	 * Scheme code for NL (Netherlands) - Netherlands Interpay CUG.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetherlandsIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for NL (Netherlands) - Netherlands Interpay CUG."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode NetherlandsIP = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetherlandsIP";
			definition = "Scheme code for NL (Netherlands) - Netherlands Interpay CUG.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "INC";
		}
	};
	/**
	 * Scheme code for JO (Jordan) - Jordan RTGS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JOD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Jordan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for JO (Jordan) - Jordan RTGS."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Jordan = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Jordan";
			definition = "Scheme code for JO (Jordan) - Jordan RTGS.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "JOD";
		}
	};
	/**
	 * Scheme code for KE (Kenya) - Kenyan Electronic Payment Settlement System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Kenya"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for KE (Kenya) - Kenyan Electronic Payment Settlement System."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Kenya = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Kenya";
			definition = "Scheme code for KE (Kenya) - Kenyan Electronic Payment Settlement System.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "KPS";
		}
	};
	/**
	 * Scheme code for LK (Sri Lanka) - Sri Lanka (Lankasettle).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LKB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SriLanka"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for LK (Sri Lanka) - Sri Lanka (Lankasettle)."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode SriLanka = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SriLanka";
			definition = "Scheme code for LK (Sri Lanka) - Sri Lanka (Lankasettle).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "LKB";
		}
	};
	/**
	 * Scheme code for SG (Singapore) - Singapore RTGS (MEPS+).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Singapore"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for SG (Singapore) - Singapore RTGS (MEPS+)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Singapore = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Singapore";
			definition = "Scheme code for SG (Singapore) - Singapore RTGS (MEPS+).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "MEP";
		}
	};
	/**
	 * Scheme code for MT (Malta) - Malta Realtime Interbank Settlement System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Malta"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for MT (Malta) - Malta Realtime Interbank Settlement System."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Malta = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Malta";
			definition = "Scheme code for MT (Malta) - Malta Realtime Interbank Settlement System.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "MRS";
		}
	};
	/**
	 * Scheme code for NA (Namibian) - Namibian Interbank Settlement System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Namibia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for NA (Namibian) - Namibian Interbank Settlement System."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Namibia = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Namibia";
			definition = "Scheme code for NA (Namibian) - Namibian Interbank Settlement System.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "NAM";
		}
	};
	/**
	 * Scheme code for AO (Angola) - Angola RTGS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Angola"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for AO (Angola) - Angola RTGS."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Angola = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Angola";
			definition = "Scheme code for AO (Angola) - Angola RTGS.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "PTR";
		}
	};
	/**
	 * Scheme code for RO (Romania) - Romanian Electronic Payment Operations RT.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ROL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RomaniaEPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for RO (Romania) - Romanian Electronic Payment Operations RT."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode RomaniaEPO = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RomaniaEPO";
			definition = "Scheme code for RO (Romania) - Romanian Electronic Payment Operations RT.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "ROL";
		}
	};
	/**
	 * Scheme code for RO (Romania) - Romanian GSRS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ROS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RomaniaGSRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Scheme code for RO (Romania) - Romanian GSRS."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode RomaniaGSRS = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RomaniaGSRS";
			definition = "Scheme code for RO (Romania) - Romanian GSRS.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "ROS";
		}
	};
	/**
	 * Scheme code for CL (Chile) - Chilean Interbank Payment System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Chili"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for CL (Chile) - Chilean Interbank Payment System."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Chili = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Chili";
			definition = "Scheme code for CL (Chile) - Chilean Interbank Payment System.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "SCP";
		}
	};
	/**
	 * Scheme code for UK (United Kingdom) - CHAPS Sterling RTGS.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitedKingdomGBP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for UK (United Kingdom) - CHAPS Sterling RTGS."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode UnitedKingdomGBP = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "UnitedKingdomGBP";
			definition = "Scheme code for UK (United Kingdom) - CHAPS Sterling RTGS.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "STG";
		}
	};
	/**
	 * Scheme code for TH (Thailand) - Thailand Payment System (Bahtnet/2).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Thailand"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for TH (Thailand) - Thailand Payment System (Bahtnet/2)."</li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Thailand = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Thailand";
			definition = "Scheme code for TH (Thailand) - Thailand Payment System (Bahtnet/2).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "THB";
		}
	};
	/**
	 * Scheme code for TZ (Tanzania) - Tanzania Interbank Settlement System
	 * (TISS).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tanzania"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for TZ (Tanzania) - Tanzania Interbank Settlement System (TISS)."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Tanzania = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tanzania";
			definition = "Scheme code for TZ (Tanzania) - Tanzania Interbank Settlement System (TISS).";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "TIS";
		}
	};
	/**
	 * Scheme code for TT (Trinidad and Tobago ) - Trinidad and Tobago SAFE-TT.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TrinidadAndTobago"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for TT (Trinidad and Tobago ) - Trinidad and Tobago SAFE-TT."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode TrinidadAndTobago = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TrinidadAndTobago";
			definition = "Scheme code for TT (Trinidad and Tobago ) - Trinidad and Tobago SAFE-TT.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "TTD";
		}
	};
	/**
	 * Scheme code for UG (Uganda) - Uganda National Interbank Settlement
	 * System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Uganda"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for UG (Uganda) - Uganda National Interbank Settlement System."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Uganda = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Uganda";
			definition = "Scheme code for UG (Uganda) - Uganda National Interbank Settlement System.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "UIS";
		}
	};
	/**
	 * Scheme code for ZW (Zimbabwe) - Zimbabwe Electronic Transfer &amp;
	 * Settlement System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Zimbabwe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for ZW (Zimbabwe) - Zimbabwe Electronic Transfer &amp; Settlement System."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Zimbabwe = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Zimbabwe";
			definition = "Scheme code for ZW (Zimbabwe) - Zimbabwe Electronic Transfer & Settlement System.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "ZET";
		}
	};
	/**
	 * Scheme code for ZM (Zambia) - Zambian Interbank Payment &amp;Settlement
	 * System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Zambia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for ZM (Zambia) - Zambian Interbank Payment &amp;Settlement System."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Zambia = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Zambia";
			definition = "Scheme code for ZM (Zambia) - Zambian Interbank Payment &Settlement System.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "ZIS";
		}
	};
	/**
	 * Scheme code for Columbia (CO) - Colombian ACH CENIT Central Bank Payment
	 * System.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CashClearingSystemCode
	 * CashClearingSystemCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Columbia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Scheme code for Columbia (CO) - Colombian ACH CENIT Central Bank Payment System."
	 * </li>
	 * </ul>
	 */
	public static final CashClearingSystemCode Columbia = new CashClearingSystemCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Columbia";
			definition = "Scheme code for Columbia (CO) - Colombian ACH CENIT Central Bank Payment System.";
			owner_lazy = () -> com.tools20022.repository.codeset.CashClearingSystemCode.mmObject();
			codeName = "COP";
		}
	};
	final static private LinkedHashMap<String, CashClearingSystemCode> codesByName = new LinkedHashMap<>();

	protected CashClearingSystemCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ABE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashClearingSystemCode";
				definition = "Specification of a pre-agreed offering between clearing agents or the channel through which the payment instruction is to be processed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CashClearingSystemCode.EBAEuro1Step1, com.tools20022.repository.codeset.CashClearingSystemCode.Austrian,
						com.tools20022.repository.codeset.CashClearingSystemCode.NewZealand, com.tools20022.repository.codeset.CashClearingSystemCode.Azerbaijan, com.tools20022.repository.codeset.CashClearingSystemCode.BosniaHerzegovina,
						com.tools20022.repository.codeset.CashClearingSystemCode.Belgium, com.tools20022.repository.codeset.CashClearingSystemCode.Finland, com.tools20022.repository.codeset.CashClearingSystemCode.Italy,
						com.tools20022.repository.codeset.CashClearingSystemCode.Canada, com.tools20022.repository.codeset.CashClearingSystemCode.SpainCAM, com.tools20022.repository.codeset.CashClearingSystemCode.Ireland,
						com.tools20022.repository.codeset.CashClearingSystemCode.UnitedKingdom, com.tools20022.repository.codeset.CashClearingSystemCode.Denmark, com.tools20022.repository.codeset.CashClearingSystemCode.GermanyRTGSPlus,
						com.tools20022.repository.codeset.CashClearingSystemCode.EBAEuro1, com.tools20022.repository.codeset.CashClearingSystemCode.GermanyELS, com.tools20022.repository.codeset.CashClearingSystemCode.EBAStep1,
						com.tools20022.repository.codeset.CashClearingSystemCode.EBAStep2, com.tools20022.repository.codeset.CashClearingSystemCode.Croatia, com.tools20022.repository.codeset.CashClearingSystemCode.Greece,
						com.tools20022.repository.codeset.CashClearingSystemCode.Hungary, com.tools20022.repository.codeset.CashClearingSystemCode.Luxemburg, com.tools20022.repository.codeset.CashClearingSystemCode.Latvia,
						com.tools20022.repository.codeset.CashClearingSystemCode.SouthAfrica, com.tools20022.repository.codeset.CashClearingSystemCode.Mauritius, com.tools20022.repository.codeset.CashClearingSystemCode.Norway,
						com.tools20022.repository.codeset.CashClearingSystemCode.Switzerland, com.tools20022.repository.codeset.CashClearingSystemCode.Australia, com.tools20022.repository.codeset.CashClearingSystemCode.Egypt,
						com.tools20022.repository.codeset.CashClearingSystemCode.FrancePNS, com.tools20022.repository.codeset.CashClearingSystemCode.Venezuela, com.tools20022.repository.codeset.CashClearingSystemCode.SwedenSEC,
						com.tools20022.repository.codeset.CashClearingSystemCode.Slovania, com.tools20022.repository.codeset.CashClearingSystemCode.SpainES, com.tools20022.repository.codeset.CashClearingSystemCode.Portugal,
						com.tools20022.repository.codeset.CashClearingSystemCode.SwedenSSK, com.tools20022.repository.codeset.CashClearingSystemCode.FranceFR, com.tools20022.repository.codeset.CashClearingSystemCode.Target,
						com.tools20022.repository.codeset.CashClearingSystemCode.Netherlands, com.tools20022.repository.codeset.CashClearingSystemCode.Fedwire, com.tools20022.repository.codeset.CashClearingSystemCode.BankOfJapanNet,
						com.tools20022.repository.codeset.CashClearingSystemCode.ForeignExchangeYenClearing, com.tools20022.repository.codeset.CashClearingSystemCode.Zengin, com.tools20022.repository.codeset.CashClearingSystemCode.RTGS,
						com.tools20022.repository.codeset.CashClearingSystemCode.ACH, com.tools20022.repository.codeset.CashClearingSystemCode.USChips, com.tools20022.repository.codeset.CashClearingSystemCode.FedNet,
						com.tools20022.repository.codeset.CashClearingSystemCode.DenmarkDDK, com.tools20022.repository.codeset.CashClearingSystemCode.Albania, com.tools20022.repository.codeset.CashClearingSystemCode.SwedenBGC,
						com.tools20022.repository.codeset.CashClearingSystemCode.Barbados, com.tools20022.repository.codeset.CashClearingSystemCode.Bulgaria, com.tools20022.repository.codeset.CashClearingSystemCode.Bahamas,
						com.tools20022.repository.codeset.CashClearingSystemCode.Botswana, com.tools20022.repository.codeset.CashClearingSystemCode.Philippines, com.tools20022.repository.codeset.CashClearingSystemCode.ECB,
						com.tools20022.repository.codeset.CashClearingSystemCode.USChipsACH, com.tools20022.repository.codeset.CashClearingSystemCode.USFedACH, com.tools20022.repository.codeset.CashClearingSystemCode.Ghana,
						com.tools20022.repository.codeset.CashClearingSystemCode.NetherlandsIP, com.tools20022.repository.codeset.CashClearingSystemCode.Jordan, com.tools20022.repository.codeset.CashClearingSystemCode.Kenya,
						com.tools20022.repository.codeset.CashClearingSystemCode.SriLanka, com.tools20022.repository.codeset.CashClearingSystemCode.Singapore, com.tools20022.repository.codeset.CashClearingSystemCode.Malta,
						com.tools20022.repository.codeset.CashClearingSystemCode.Namibia, com.tools20022.repository.codeset.CashClearingSystemCode.Angola, com.tools20022.repository.codeset.CashClearingSystemCode.RomaniaEPO,
						com.tools20022.repository.codeset.CashClearingSystemCode.RomaniaGSRS, com.tools20022.repository.codeset.CashClearingSystemCode.Chili, com.tools20022.repository.codeset.CashClearingSystemCode.UnitedKingdomGBP,
						com.tools20022.repository.codeset.CashClearingSystemCode.Thailand, com.tools20022.repository.codeset.CashClearingSystemCode.Tanzania, com.tools20022.repository.codeset.CashClearingSystemCode.TrinidadAndTobago,
						com.tools20022.repository.codeset.CashClearingSystemCode.Uganda, com.tools20022.repository.codeset.CashClearingSystemCode.Zimbabwe, com.tools20022.repository.codeset.CashClearingSystemCode.Zambia,
						com.tools20022.repository.codeset.CashClearingSystemCode.Columbia);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EBAEuro1Step1.getCodeName().get(), EBAEuro1Step1);
		codesByName.put(Austrian.getCodeName().get(), Austrian);
		codesByName.put(NewZealand.getCodeName().get(), NewZealand);
		codesByName.put(Azerbaijan.getCodeName().get(), Azerbaijan);
		codesByName.put(BosniaHerzegovina.getCodeName().get(), BosniaHerzegovina);
		codesByName.put(Belgium.getCodeName().get(), Belgium);
		codesByName.put(Finland.getCodeName().get(), Finland);
		codesByName.put(Italy.getCodeName().get(), Italy);
		codesByName.put(Canada.getCodeName().get(), Canada);
		codesByName.put(SpainCAM.getCodeName().get(), SpainCAM);
		codesByName.put(Ireland.getCodeName().get(), Ireland);
		codesByName.put(UnitedKingdom.getCodeName().get(), UnitedKingdom);
		codesByName.put(Denmark.getCodeName().get(), Denmark);
		codesByName.put(GermanyRTGSPlus.getCodeName().get(), GermanyRTGSPlus);
		codesByName.put(EBAEuro1.getCodeName().get(), EBAEuro1);
		codesByName.put(GermanyELS.getCodeName().get(), GermanyELS);
		codesByName.put(EBAStep1.getCodeName().get(), EBAStep1);
		codesByName.put(EBAStep2.getCodeName().get(), EBAStep2);
		codesByName.put(Croatia.getCodeName().get(), Croatia);
		codesByName.put(Greece.getCodeName().get(), Greece);
		codesByName.put(Hungary.getCodeName().get(), Hungary);
		codesByName.put(Luxemburg.getCodeName().get(), Luxemburg);
		codesByName.put(Latvia.getCodeName().get(), Latvia);
		codesByName.put(SouthAfrica.getCodeName().get(), SouthAfrica);
		codesByName.put(Mauritius.getCodeName().get(), Mauritius);
		codesByName.put(Norway.getCodeName().get(), Norway);
		codesByName.put(Switzerland.getCodeName().get(), Switzerland);
		codesByName.put(Australia.getCodeName().get(), Australia);
		codesByName.put(Egypt.getCodeName().get(), Egypt);
		codesByName.put(FrancePNS.getCodeName().get(), FrancePNS);
		codesByName.put(Venezuela.getCodeName().get(), Venezuela);
		codesByName.put(SwedenSEC.getCodeName().get(), SwedenSEC);
		codesByName.put(Slovania.getCodeName().get(), Slovania);
		codesByName.put(SpainES.getCodeName().get(), SpainES);
		codesByName.put(Portugal.getCodeName().get(), Portugal);
		codesByName.put(SwedenSSK.getCodeName().get(), SwedenSSK);
		codesByName.put(FranceFR.getCodeName().get(), FranceFR);
		codesByName.put(Target.getCodeName().get(), Target);
		codesByName.put(Netherlands.getCodeName().get(), Netherlands);
		codesByName.put(Fedwire.getCodeName().get(), Fedwire);
		codesByName.put(BankOfJapanNet.getCodeName().get(), BankOfJapanNet);
		codesByName.put(ForeignExchangeYenClearing.getCodeName().get(), ForeignExchangeYenClearing);
		codesByName.put(Zengin.getCodeName().get(), Zengin);
		codesByName.put(RTGS.getCodeName().get(), RTGS);
		codesByName.put(ACH.getCodeName().get(), ACH);
		codesByName.put(USChips.getCodeName().get(), USChips);
		codesByName.put(FedNet.getCodeName().get(), FedNet);
		codesByName.put(DenmarkDDK.getCodeName().get(), DenmarkDDK);
		codesByName.put(Albania.getCodeName().get(), Albania);
		codesByName.put(SwedenBGC.getCodeName().get(), SwedenBGC);
		codesByName.put(Barbados.getCodeName().get(), Barbados);
		codesByName.put(Bulgaria.getCodeName().get(), Bulgaria);
		codesByName.put(Bahamas.getCodeName().get(), Bahamas);
		codesByName.put(Botswana.getCodeName().get(), Botswana);
		codesByName.put(Philippines.getCodeName().get(), Philippines);
		codesByName.put(ECB.getCodeName().get(), ECB);
		codesByName.put(USChipsACH.getCodeName().get(), USChipsACH);
		codesByName.put(USFedACH.getCodeName().get(), USFedACH);
		codesByName.put(Ghana.getCodeName().get(), Ghana);
		codesByName.put(NetherlandsIP.getCodeName().get(), NetherlandsIP);
		codesByName.put(Jordan.getCodeName().get(), Jordan);
		codesByName.put(Kenya.getCodeName().get(), Kenya);
		codesByName.put(SriLanka.getCodeName().get(), SriLanka);
		codesByName.put(Singapore.getCodeName().get(), Singapore);
		codesByName.put(Malta.getCodeName().get(), Malta);
		codesByName.put(Namibia.getCodeName().get(), Namibia);
		codesByName.put(Angola.getCodeName().get(), Angola);
		codesByName.put(RomaniaEPO.getCodeName().get(), RomaniaEPO);
		codesByName.put(RomaniaGSRS.getCodeName().get(), RomaniaGSRS);
		codesByName.put(Chili.getCodeName().get(), Chili);
		codesByName.put(UnitedKingdomGBP.getCodeName().get(), UnitedKingdomGBP);
		codesByName.put(Thailand.getCodeName().get(), Thailand);
		codesByName.put(Tanzania.getCodeName().get(), Tanzania);
		codesByName.put(TrinidadAndTobago.getCodeName().get(), TrinidadAndTobago);
		codesByName.put(Uganda.getCodeName().get(), Uganda);
		codesByName.put(Zimbabwe.getCodeName().get(), Zimbabwe);
		codesByName.put(Zambia.getCodeName().get(), Zambia);
		codesByName.put(Columbia.getCodeName().get(), Columbia);
	}

	public static CashClearingSystemCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CashClearingSystemCode[] values() {
		CashClearingSystemCode[] values = new CashClearingSystemCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CashClearingSystemCode> {
		@Override
		public CashClearingSystemCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CashClearingSystemCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}