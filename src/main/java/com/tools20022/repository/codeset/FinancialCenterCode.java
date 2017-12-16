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
import com.tools20022.repository.codeset.FinancialCenterCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the financial center taken into account to adjust a date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Brussels
 * FinancialCenterCode.mmBrussels}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#BuenosAires
 * FinancialCenterCode.mmBuenosAires}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Vienna
 * FinancialCenterCode.mmVienna}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Melbourne
 * FinancialCenterCode.mmMelbourne}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Sydney
 * FinancialCenterCode.mmSydney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#SaoPaulo
 * FinancialCenterCode.mmSaoPaulo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Montreal
 * FinancialCenterCode.mmMontreal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Toronto
 * FinancialCenterCode.mmToronto}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Geneva
 * FinancialCenterCode.mmGeneva}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Bratislava
 * FinancialCenterCode.mmBratislava}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Santiago
 * FinancialCenterCode.mmSantiago}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Beijing
 * FinancialCenterCode.mmBeijing}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Prague
 * FinancialCenterCode.mmPrague}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Frankfurt
 * FinancialCenterCode.mmFrankfurt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Copenhagen
 * FinancialCenterCode.mmCopenhagen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Tallinn
 * FinancialCenterCode.mmTallinn}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Madrid
 * FinancialCenterCode.mmMadrid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Helsinki
 * FinancialCenterCode.mmHelsinki}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Paris
 * FinancialCenterCode.mmParis}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#London
 * FinancialCenterCode.mmLondon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Athens
 * FinancialCenterCode.mmAthens}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#HongKong
 * FinancialCenterCode.mmHongKong}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Budapest
 * FinancialCenterCode.mmBudapest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Jakarta
 * FinancialCenterCode.mmJakarta}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Dublin
 * FinancialCenterCode.mmDublin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#TelAviv
 * FinancialCenterCode.mmTelAviv}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Milan
 * FinancialCenterCode.mmMilan}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Rome
 * FinancialCenterCode.mmRome}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Tokyo
 * FinancialCenterCode.mmTokyo}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Seoul
 * FinancialCenterCode.mmSeoul}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Beirut
 * FinancialCenterCode.mmBeirut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Luxembourg
 * FinancialCenterCode.mmLuxembourg}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#KualaLumpur
 * FinancialCenterCode.mmKualaLumpur}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#MexicoCity
 * FinancialCenterCode.mmMexicoCity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Amsterdam
 * FinancialCenterCode.mmAmsterdam}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Oslo
 * FinancialCenterCode.mmOslo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#NewYorkFed
 * FinancialCenterCode.mmNewYorkFed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#NewYorkStockExchange
 * FinancialCenterCode.mmNewYorkStockExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Auckland
 * FinancialCenterCode.mmAuckland}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Wellington
 * FinancialCenterCode.mmWellington}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#PanamaCity
 * FinancialCenterCode.mmPanamaCity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Manila
 * FinancialCenterCode.mmManila}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Warsaw
 * FinancialCenterCode.mmWarsaw}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Lisbon
 * FinancialCenterCode.mmLisbon}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Moscow
 * FinancialCenterCode.mmMoscow}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Riyadh
 * FinancialCenterCode.mmRiyadh}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Stockholm
 * FinancialCenterCode.mmStockholm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Singapore
 * FinancialCenterCode.mmSingapore}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Bangkok
 * FinancialCenterCode.mmBangkok}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Taipei
 * FinancialCenterCode.mmTaipei}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Ankara
 * FinancialCenterCode.mmAnkara}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Chicago
 * FinancialCenterCode.mmChicago}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#LosAngeles
 * FinancialCenterCode.mmLosAngeles}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#USGovernmentSecurities
 * FinancialCenterCode.mmUSGovernmentSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#NewYork
 * FinancialCenterCode.mmNewYork}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Johannesburg
 * FinancialCenterCode.mmJohannesburg}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FinancialCenterCode#Zurich
 * FinancialCenterCode.mmZurich}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BEBR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancialCenterCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the financial center taken into account to adjust a date."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancialCenterCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Code for Brussels
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Brussels"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Brussels"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Brussels = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Brussels";
			definition = "Code for Brussels";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "BEBR";
		}
	};
	/**
	 * Code for Buenos Aires
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuenosAires"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Buenos Aires"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode BuenosAires = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuenosAires";
			definition = "Code for Buenos Aires";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "ARBA";
		}
	};
	/**
	 * Code for Vienna
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vienna"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Vienna"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Vienna = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Vienna";
			definition = "Code for Vienna";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "ATVI";
		}
	};
	/**
	 * Code for Melbourne
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Melbourne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Melbourne"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Melbourne = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Melbourne";
			definition = "Code for Melbourne";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "AUME";
		}
	};
	/**
	 * Code for Sydney
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUSY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sydney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Sydney"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Sydney = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Sydney";
			definition = "Code for Sydney";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "AUSY";
		}
	};
	/**
	 * Code for Sao Paulo
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaoPaulo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Sao Paulo"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode SaoPaulo = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SaoPaulo";
			definition = "Code for Sao Paulo";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "BRSP";
		}
	};
	/**
	 * Code for Montreal
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Montreal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Montreal"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Montreal = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Montreal";
			definition = "Code for Montreal";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "CAMO";
		}
	};
	/**
	 * Code for Toronto
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CATO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Toronto"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Toronto"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Toronto = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Toronto";
			definition = "Code for Toronto";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "CATO";
		}
	};
	/**
	 * Code for Geneva
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHGE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Geneva"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Geneva"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Geneva = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Geneva";
			definition = "Code for Geneva";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "CHGE";
		}
	};
	/**
	 * Code for Bratislava
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SKBR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bratislava"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Bratislava"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Bratislava = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bratislava";
			definition = "Code for Bratislava";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "SKBR";
		}
	};
	/**
	 * Code for Santiago
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Santiago"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Santiago"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Santiago = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Santiago";
			definition = "Code for Santiago";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "CLSA";
		}
	};
	/**
	 * Code for Beijing
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beijing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Beijing"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Beijing = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Beijing";
			definition = "Code for Beijing";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "CNBE";
		}
	};
	/**
	 * Code for Prague
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CZPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prague"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Prague"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Prague = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Prague";
			definition = "Code for Prague";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "CZPR";
		}
	};
	/**
	 * Code for Frankfurt
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Frankfurt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Frankfurt"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Frankfurt = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Frankfurt";
			definition = "Code for Frankfurt";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "DEFR";
		}
	};
	/**
	 * Code for Copenhagen
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DKCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Copenhagen"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Copenhagen"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Copenhagen = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Copenhagen";
			definition = "Code for Copenhagen";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "DKCO";
		}
	};
	/**
	 * Code for Tallinn
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EETA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tallinn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Tallinn"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Tallinn = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tallinn";
			definition = "Code for Tallinn";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "EETA";
		}
	};
	/**
	 * Code for Madrid
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Madrid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Madrid"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Madrid = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Madrid";
			definition = "Code for Madrid";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "ESMA";
		}
	};
	/**
	 * Code for Helsinki
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIHE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Helsinki"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Helsinki"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Helsinki = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Helsinki";
			definition = "Code for Helsinki";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "FIHE";
		}
	};
	/**
	 * Code for Paris
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Paris"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Paris"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Paris = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Paris";
			definition = "Code for Paris";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "FRPA";
		}
	};
	/**
	 * Code for London
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GBLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "London"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for London"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode London = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "London";
			definition = "Code for London";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "GBLO";
		}
	};
	/**
	 * Code for Athens
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GRAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Athens"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Athens"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Athens = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Athens";
			definition = "Code for Athens";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "GRAT";
		}
	};
	/**
	 * Code for Hong Kong
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HKHK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HongKong"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Hong Kong"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode HongKong = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HongKong";
			definition = "Code for Hong Kong";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "HKHK";
		}
	};
	/**
	 * Code for Budapest
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HUBU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Budapest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Budapest"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Budapest = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Budapest";
			definition = "Code for Budapest";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "HUBU";
		}
	};
	/**
	 * Code for Jakarta
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDJA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Jakarta"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Jakarta"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Jakarta = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Jakarta";
			definition = "Code for Jakarta";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "IDJA";
		}
	};
	/**
	 * Code for Dublin
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IEDU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dublin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Dublin"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Dublin = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Dublin";
			definition = "Code for Dublin";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "IEDU";
		}
	};
	/**
	 * Code for Tel Aviv
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ILTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TelAviv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Tel Aviv"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode TelAviv = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TelAviv";
			definition = "Code for Tel Aviv";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "ILTA";
		}
	};
	/**
	 * Code for Milan
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Milan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Milan"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Milan = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Milan";
			definition = "Code for Milan";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "ITMI";
		}
	};
	/**
	 * Code for Rome
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITRO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Rome"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Rome = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rome";
			definition = "Code for Rome";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "ITRO";
		}
	};
	/**
	 * Code for Tokyo
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "JPTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tokyo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Tokyo"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Tokyo = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Tokyo";
			definition = "Code for Tokyo";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "JPTO";
		}
	};
	/**
	 * Code for Seoul
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KRSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seoul"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Seoul"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Seoul = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Seoul";
			definition = "Code for Seoul";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "KRSE";
		}
	};
	/**
	 * Code for Beirut
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LBBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Beirut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Beirut"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Beirut = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Beirut";
			definition = "Code for Beirut";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "LBBE";
		}
	};
	/**
	 * Code for Luxembourg
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LULU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Luxembourg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Luxembourg"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Luxembourg = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Luxembourg";
			definition = "Code for Luxembourg";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "LULU";
		}
	};
	/**
	 * Code for Kuala Lumpur
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MYKL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KualaLumpur"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Kuala Lumpur"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode KualaLumpur = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "KualaLumpur";
			definition = "Code for Kuala Lumpur";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "MYKL";
		}
	};
	/**
	 * Code for Mexico City
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MXMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MexicoCity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Mexico City"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode MexicoCity = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MexicoCity";
			definition = "Code for Mexico City";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "MXMC";
		}
	};
	/**
	 * Code for Amsterdam
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NLAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amsterdam"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Amsterdam"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Amsterdam = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amsterdam";
			definition = "Code for Amsterdam";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "NLAM";
		}
	};
	/**
	 * Code for Oslo
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Oslo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Oslo"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Oslo = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Oslo";
			definition = "Code for Oslo";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "NOOS";
		}
	};
	/**
	 * Code for New York Fed
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NYFD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewYorkFed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for New York Fed"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode NewYorkFed = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewYorkFed";
			definition = "Code for New York Fed";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "NYFD";
		}
	};
	/**
	 * Code for New York Stock Exchange
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NYSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewYorkStockExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for New York Stock Exchange"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode NewYorkStockExchange = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewYorkStockExchange";
			definition = "Code for New York Stock Exchange";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "NYSE";
		}
	};
	/**
	 * Code for Auckland
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NZAU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Auckland"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Auckland"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Auckland = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Auckland";
			definition = "Code for Auckland";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "NZAU";
		}
	};
	/**
	 * Code for Wellington
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NZWE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wellington"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Wellington"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Wellington = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Wellington";
			definition = "Code for Wellington";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "NZWE";
		}
	};
	/**
	 * Code for Panama City
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PanamaCity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Panama City"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode PanamaCity = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PanamaCity";
			definition = "Code for Panama City";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "PAPC";
		}
	};
	/**
	 * Code for Manila
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Manila"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Manila"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Manila = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Manila";
			definition = "Code for Manila";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "PHMA";
		}
	};
	/**
	 * Code for Warsaw
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warsaw"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Warsaw"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Warsaw = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Warsaw";
			definition = "Code for Warsaw";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "PLWA";
		}
	};
	/**
	 * Code for Lisbon
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PTLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lisbon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Lisbon"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Lisbon = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Lisbon";
			definition = "Code for Lisbon";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "PTLI";
		}
	};
	/**
	 * Code for Moscow
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RUMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Moscow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Moscow"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Moscow = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Moscow";
			definition = "Code for Moscow";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "RUMO";
		}
	};
	/**
	 * Code for Riyadh
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Riyadh"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Riyadh"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Riyadh = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Riyadh";
			definition = "Code for Riyadh";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "SARI";
		}
	};
	/**
	 * Code for Stockholm
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stockholm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Stockholm"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Stockholm = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Stockholm";
			definition = "Code for Stockholm";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "SEST";
		}
	};
	/**
	 * Code for Singapore
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGSI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Singapore"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Singapore"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Singapore = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Singapore";
			definition = "Code for Singapore";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "SGSI";
		}
	};
	/**
	 * Code for Bangkok
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THBA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bangkok"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Bangkok"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Bangkok = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Bangkok";
			definition = "Code for Bangkok";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "THBA";
		}
	};
	/**
	 * Code for Taipei
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TWTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Taipei"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Taipei"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Taipei = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Taipei";
			definition = "Code for Taipei";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "TWTA";
		}
	};
	/**
	 * Code for Ankara
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ankara"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Ankara"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Ankara = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Ankara";
			definition = "Code for Ankara";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "TRAN";
		}
	};
	/**
	 * Code for Chicago
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Chicago"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Chicago"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Chicago = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Chicago";
			definition = "Code for Chicago";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "USCH";
		}
	};
	/**
	 * Code for Los Angeles
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LosAngeles"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Los Angeles"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode LosAngeles = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LosAngeles";
			definition = "Code for Los Angeles";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "USLA";
		}
	};
	/**
	 * Code for U.S. Government Securities
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "U.S.GovernmentSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for U.S. Government Securities"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode USGovernmentSecurities = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "U.S.GovernmentSecurities";
			definition = "Code for U.S. Government Securities";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "USGS";
		}
	};
	/**
	 * Code for New York
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USNY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewYork"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for New York"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode NewYork = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NewYork";
			definition = "Code for New York";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "USNY";
		}
	};
	/**
	 * Code for Johannesburg
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ZAJO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Johannesburg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Johannesburg"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Johannesburg = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Johannesburg";
			definition = "Code for Johannesburg";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "ZAJO";
		}
	};
	/**
	 * Code for Zurich
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancialCenterCode
	 * FinancialCenterCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHZU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Zurich"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Code for Zurich"</li>
	 * </ul>
	 */
	public static final FinancialCenterCode Zurich = new FinancialCenterCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Zurich";
			definition = "Code for Zurich";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancialCenterCode.mmObject();
			codeName = "CHZU";
		}
	};
	final static private LinkedHashMap<String, FinancialCenterCode> codesByName = new LinkedHashMap<>();

	protected FinancialCenterCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BEBR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancialCenterCode";
				definition = "Indicates the financial center taken into account to adjust a date.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancialCenterCode.Brussels, com.tools20022.repository.codeset.FinancialCenterCode.BuenosAires,
						com.tools20022.repository.codeset.FinancialCenterCode.Vienna, com.tools20022.repository.codeset.FinancialCenterCode.Melbourne, com.tools20022.repository.codeset.FinancialCenterCode.Sydney,
						com.tools20022.repository.codeset.FinancialCenterCode.SaoPaulo, com.tools20022.repository.codeset.FinancialCenterCode.Montreal, com.tools20022.repository.codeset.FinancialCenterCode.Toronto,
						com.tools20022.repository.codeset.FinancialCenterCode.Geneva, com.tools20022.repository.codeset.FinancialCenterCode.Bratislava, com.tools20022.repository.codeset.FinancialCenterCode.Santiago,
						com.tools20022.repository.codeset.FinancialCenterCode.Beijing, com.tools20022.repository.codeset.FinancialCenterCode.Prague, com.tools20022.repository.codeset.FinancialCenterCode.Frankfurt,
						com.tools20022.repository.codeset.FinancialCenterCode.Copenhagen, com.tools20022.repository.codeset.FinancialCenterCode.Tallinn, com.tools20022.repository.codeset.FinancialCenterCode.Madrid,
						com.tools20022.repository.codeset.FinancialCenterCode.Helsinki, com.tools20022.repository.codeset.FinancialCenterCode.Paris, com.tools20022.repository.codeset.FinancialCenterCode.London,
						com.tools20022.repository.codeset.FinancialCenterCode.Athens, com.tools20022.repository.codeset.FinancialCenterCode.HongKong, com.tools20022.repository.codeset.FinancialCenterCode.Budapest,
						com.tools20022.repository.codeset.FinancialCenterCode.Jakarta, com.tools20022.repository.codeset.FinancialCenterCode.Dublin, com.tools20022.repository.codeset.FinancialCenterCode.TelAviv,
						com.tools20022.repository.codeset.FinancialCenterCode.Milan, com.tools20022.repository.codeset.FinancialCenterCode.Rome, com.tools20022.repository.codeset.FinancialCenterCode.Tokyo,
						com.tools20022.repository.codeset.FinancialCenterCode.Seoul, com.tools20022.repository.codeset.FinancialCenterCode.Beirut, com.tools20022.repository.codeset.FinancialCenterCode.Luxembourg,
						com.tools20022.repository.codeset.FinancialCenterCode.KualaLumpur, com.tools20022.repository.codeset.FinancialCenterCode.MexicoCity, com.tools20022.repository.codeset.FinancialCenterCode.Amsterdam,
						com.tools20022.repository.codeset.FinancialCenterCode.Oslo, com.tools20022.repository.codeset.FinancialCenterCode.NewYorkFed, com.tools20022.repository.codeset.FinancialCenterCode.NewYorkStockExchange,
						com.tools20022.repository.codeset.FinancialCenterCode.Auckland, com.tools20022.repository.codeset.FinancialCenterCode.Wellington, com.tools20022.repository.codeset.FinancialCenterCode.PanamaCity,
						com.tools20022.repository.codeset.FinancialCenterCode.Manila, com.tools20022.repository.codeset.FinancialCenterCode.Warsaw, com.tools20022.repository.codeset.FinancialCenterCode.Lisbon,
						com.tools20022.repository.codeset.FinancialCenterCode.Moscow, com.tools20022.repository.codeset.FinancialCenterCode.Riyadh, com.tools20022.repository.codeset.FinancialCenterCode.Stockholm,
						com.tools20022.repository.codeset.FinancialCenterCode.Singapore, com.tools20022.repository.codeset.FinancialCenterCode.Bangkok, com.tools20022.repository.codeset.FinancialCenterCode.Taipei,
						com.tools20022.repository.codeset.FinancialCenterCode.Ankara, com.tools20022.repository.codeset.FinancialCenterCode.Chicago, com.tools20022.repository.codeset.FinancialCenterCode.LosAngeles,
						com.tools20022.repository.codeset.FinancialCenterCode.USGovernmentSecurities, com.tools20022.repository.codeset.FinancialCenterCode.NewYork, com.tools20022.repository.codeset.FinancialCenterCode.Johannesburg,
						com.tools20022.repository.codeset.FinancialCenterCode.Zurich);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Brussels.getCodeName().get(), Brussels);
		codesByName.put(BuenosAires.getCodeName().get(), BuenosAires);
		codesByName.put(Vienna.getCodeName().get(), Vienna);
		codesByName.put(Melbourne.getCodeName().get(), Melbourne);
		codesByName.put(Sydney.getCodeName().get(), Sydney);
		codesByName.put(SaoPaulo.getCodeName().get(), SaoPaulo);
		codesByName.put(Montreal.getCodeName().get(), Montreal);
		codesByName.put(Toronto.getCodeName().get(), Toronto);
		codesByName.put(Geneva.getCodeName().get(), Geneva);
		codesByName.put(Bratislava.getCodeName().get(), Bratislava);
		codesByName.put(Santiago.getCodeName().get(), Santiago);
		codesByName.put(Beijing.getCodeName().get(), Beijing);
		codesByName.put(Prague.getCodeName().get(), Prague);
		codesByName.put(Frankfurt.getCodeName().get(), Frankfurt);
		codesByName.put(Copenhagen.getCodeName().get(), Copenhagen);
		codesByName.put(Tallinn.getCodeName().get(), Tallinn);
		codesByName.put(Madrid.getCodeName().get(), Madrid);
		codesByName.put(Helsinki.getCodeName().get(), Helsinki);
		codesByName.put(Paris.getCodeName().get(), Paris);
		codesByName.put(London.getCodeName().get(), London);
		codesByName.put(Athens.getCodeName().get(), Athens);
		codesByName.put(HongKong.getCodeName().get(), HongKong);
		codesByName.put(Budapest.getCodeName().get(), Budapest);
		codesByName.put(Jakarta.getCodeName().get(), Jakarta);
		codesByName.put(Dublin.getCodeName().get(), Dublin);
		codesByName.put(TelAviv.getCodeName().get(), TelAviv);
		codesByName.put(Milan.getCodeName().get(), Milan);
		codesByName.put(Rome.getCodeName().get(), Rome);
		codesByName.put(Tokyo.getCodeName().get(), Tokyo);
		codesByName.put(Seoul.getCodeName().get(), Seoul);
		codesByName.put(Beirut.getCodeName().get(), Beirut);
		codesByName.put(Luxembourg.getCodeName().get(), Luxembourg);
		codesByName.put(KualaLumpur.getCodeName().get(), KualaLumpur);
		codesByName.put(MexicoCity.getCodeName().get(), MexicoCity);
		codesByName.put(Amsterdam.getCodeName().get(), Amsterdam);
		codesByName.put(Oslo.getCodeName().get(), Oslo);
		codesByName.put(NewYorkFed.getCodeName().get(), NewYorkFed);
		codesByName.put(NewYorkStockExchange.getCodeName().get(), NewYorkStockExchange);
		codesByName.put(Auckland.getCodeName().get(), Auckland);
		codesByName.put(Wellington.getCodeName().get(), Wellington);
		codesByName.put(PanamaCity.getCodeName().get(), PanamaCity);
		codesByName.put(Manila.getCodeName().get(), Manila);
		codesByName.put(Warsaw.getCodeName().get(), Warsaw);
		codesByName.put(Lisbon.getCodeName().get(), Lisbon);
		codesByName.put(Moscow.getCodeName().get(), Moscow);
		codesByName.put(Riyadh.getCodeName().get(), Riyadh);
		codesByName.put(Stockholm.getCodeName().get(), Stockholm);
		codesByName.put(Singapore.getCodeName().get(), Singapore);
		codesByName.put(Bangkok.getCodeName().get(), Bangkok);
		codesByName.put(Taipei.getCodeName().get(), Taipei);
		codesByName.put(Ankara.getCodeName().get(), Ankara);
		codesByName.put(Chicago.getCodeName().get(), Chicago);
		codesByName.put(LosAngeles.getCodeName().get(), LosAngeles);
		codesByName.put(USGovernmentSecurities.getCodeName().get(), USGovernmentSecurities);
		codesByName.put(NewYork.getCodeName().get(), NewYork);
		codesByName.put(Johannesburg.getCodeName().get(), Johannesburg);
		codesByName.put(Zurich.getCodeName().get(), Zurich);
	}

	public static FinancialCenterCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancialCenterCode[] values() {
		FinancialCenterCode[] values = new FinancialCenterCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancialCenterCode> {
		@Override
		public FinancialCenterCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancialCenterCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}