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
import com.tools20022.repository.codeset.SettlementDateCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the date of settlement, in coded form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDateCode#Regular
 * SettlementDateCode.mmRegular}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDateCode#Cash
 * SettlementDateCode.mmCash}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDateCode#NextDay
 * SettlementDateCode.mmNextDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#TPlusOne
 * SettlementDateCode.mmTPlusOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#TPlusTwo
 * SettlementDateCode.mmTPlusTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#TPlusThree
 * SettlementDateCode.mmTPlusThree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#TPlusFour
 * SettlementDateCode.mmTPlusFour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#TPlusFive
 * SettlementDateCode.mmTPlusFive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#SellersOption
 * SettlementDateCode.mmSellersOption}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDateCode#Future
 * SettlementDateCode.mmFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#AsSoonAsPossible
 * SettlementDateCode.mmAsSoonAsPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#AtEndOfContract
 * SettlementDateCode.mmAtEndOfContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#WhenAndIfIssued
 * SettlementDateCode.mmWhenAndIfIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#WhenDistributed
 * SettlementDateCode.mmWhenDistributed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#WhenIssuedOrDistributed
 * SettlementDateCode.mmWhenIssuedOrDistributed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#ToBeAnnouncedTrade
 * SettlementDateCode.mmToBeAnnouncedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#EndOfMonth
 * SettlementDateCode.mmEndOfMonth}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDateCode#Cleared
 * SettlementDateCode.mmCleared}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#SavingsPlan
 * SettlementDateCode.mmSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#WhenIssued
 * SettlementDateCode.mmWhenIssued}</li>
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
 * <li>"REGU"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementDateCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the date of settlement, in coded form."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementDateCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Settlement takes place under the standard rules applicable to the market
	 * and instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REGU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place under the standard rules applicable to the market and instrument."
	 * </li>
	 * </ul>
	 */
	public static final SettlementDateCode Regular = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Regular";
			definition = "Settlement takes place under the standard rules applicable to the market and instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "REGU";
		}
	};
	/**
	 * Settlement takes place on the trade date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement takes place on the trade date."</li>
	 * </ul>
	 */
	public static final SettlementDateCode Cash = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Settlement takes place on the trade date.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Settlement takes place on the day after trade date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NXTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement takes place on the day after trade date."</li>
	 * </ul>
	 */
	public static final SettlementDateCode NextDay = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextDay";
			definition = "Settlement takes place on the day after trade date.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "NXTD";
		}
	};
	/**
	 * Settlement takes place on the trade date plus one business day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TONE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusOne"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place on the trade date plus one business day."</li>
	 * </ul>
	 */
	public static final SettlementDateCode TPlusOne = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TPlusOne";
			definition = "Settlement takes place on the trade date plus one business day.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "TONE";
		}
	};
	/**
	 * Settlement takes place on the trade date plus two business days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTWO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusTwo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place on the trade date plus two business days."</li>
	 * </ul>
	 */
	public static final SettlementDateCode TPlusTwo = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TPlusTwo";
			definition = "Settlement takes place on the trade date plus two business days.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "TTWO";
		}
	};
	/**
	 * Settlement takes place on the trade date plus three business days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusThree"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place on the trade date plus three business days."</li>
	 * </ul>
	 */
	public static final SettlementDateCode TPlusThree = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TPlusThree";
			definition = "Settlement takes place on the trade date plus three business days.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "TTRE";
		}
	};
	/**
	 * Settlement takes place on the trade date plus four business days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFOR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusFour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place on the trade date plus four business days."</li>
	 * </ul>
	 */
	public static final SettlementDateCode TPlusFour = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TPlusFour";
			definition = "Settlement takes place on the trade date plus four business days.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "TFOR";
		}
	};
	/**
	 * Settlement takes place on the trade date plus five business days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TFIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TPlusFive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place on the trade date plus five business days."</li>
	 * </ul>
	 */
	public static final SettlementDateCode TPlusFive = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TPlusFive";
			definition = "Settlement takes place on the trade date plus five business days.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "TFIV";
		}
	};
	/**
	 * Settlement takes place at the choice/option of the seller.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SELL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellersOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place at the choice/option of the seller."</li>
	 * </ul>
	 */
	public static final SettlementDateCode SellersOption = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellersOption";
			definition = "Settlement takes place at the choice/option of the seller.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "SELL";
		}
	};
	/**
	 * Settlement takes place on the trade date plus six or more business days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place on the trade date plus six or more business days."
	 * </li>
	 * </ul>
	 */
	public static final SettlementDateCode Future = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Future";
			definition = "Settlement takes place on the trade date plus six or more business days.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "FUTU";
		}
	};
	/**
	 * Transfer is to be effected as soon as possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AsSoonAsPossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is to be effected as soon as possible."</li>
	 * </ul>
	 */
	public static final SettlementDateCode AsSoonAsPossible = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AsSoonAsPossible";
			definition = "Transfer is to be effected as soon as possible.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "ASAP";
		}
	};
	/**
	 * Transfer is to be effected at the end of the contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENDC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AtEndOfContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transfer is to be effected at the end of the contract."</li>
	 * </ul>
	 */
	public static final SettlementDateCode AtEndOfContract = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AtEndOfContract";
			definition = "Transfer is to be effected at the end of the contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "ENDC";
		}
	};
	/**
	 * Settlement takes place when the financial instrument is issued by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WHIF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenAndIfIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place when the financial instrument is issued by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final SettlementDateCode WhenAndIfIssued = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhenAndIfIssued";
			definition = "Settlement takes place when the financial instrument is issued by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "WHIF";
		}
	};
	/**
	 * Settlement takes place when the financial instrument is distributed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WDIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenDistributed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place when the financial instrument is distributed."</li>
	 * </ul>
	 */
	public static final SettlementDateCode WhenDistributed = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhenDistributed";
			definition = "Settlement takes place when the financial instrument is distributed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "WDIS";
		}
	};
	/**
	 * Settlement takes place when the financial instrument is issued or
	 * distributed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WHID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenIssuedOrDistributed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place when the financial instrument is issued or distributed."
	 * </li>
	 * </ul>
	 */
	public static final SettlementDateCode WhenIssuedOrDistributed = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhenIssuedOrDistributed";
			definition = "Settlement takes place when the financial instrument is issued or distributed.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "WHID";
		}
	};
	/**
	 * Settlement takes place as a result of a "to be announced" trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TBAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToBeAnnouncedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Settlement takes place as a result of a \"to be announced\" trade."</li>
	 * </ul>
	 */
	public static final SettlementDateCode ToBeAnnouncedTrade = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ToBeAnnouncedTrade";
			definition = "Settlement takes place as a result of a \"to be announced\" trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "TBAT";
		}
	};
	/**
	 * Settlement takes place at the end of the month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MONT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement takes place at the end of the month."</li>
	 * </ul>
	 */
	public static final SettlementDateCode EndOfMonth = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndOfMonth";
			definition = "Settlement takes place at the end of the month.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "MONT";
		}
	};
	/**
	 * Cash settlement takes place before trade date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cleared"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash settlement takes place before trade date."</li>
	 * </ul>
	 */
	public static final SettlementDateCode Cleared = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cleared";
			definition = "Cash settlement takes place before trade date.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "CLEA";
		}
	};
	/**
	 * Money is withdrawn automatically from the savings plan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SavingsPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Money is withdrawn automatically from the savings plan."</li>
	 * </ul>
	 */
	public static final SettlementDateCode SavingsPlan = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SavingsPlan";
			definition = "Money is withdrawn automatically from the savings plan.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "SAVE";
		}
	};
	/**
	 * Settlement is to be done when the security is issued.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode
	 * SettlementDateCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WISS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhenIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement is to be done when the security is issued."</li>
	 * </ul>
	 */
	public static final SettlementDateCode WhenIssued = new SettlementDateCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhenIssued";
			definition = "Settlement is to be done when the security is issued.";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementDateCode.mmObject();
			codeName = "WISS";
		}
	};
	final static private LinkedHashMap<String, SettlementDateCode> codesByName = new LinkedHashMap<>();

	protected SettlementDateCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("REGU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDateCode";
				definition = "Specifies the date of settlement, in coded form.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementDateCode.Regular, com.tools20022.repository.codeset.SettlementDateCode.Cash, com.tools20022.repository.codeset.SettlementDateCode.NextDay,
						com.tools20022.repository.codeset.SettlementDateCode.TPlusOne, com.tools20022.repository.codeset.SettlementDateCode.TPlusTwo, com.tools20022.repository.codeset.SettlementDateCode.TPlusThree,
						com.tools20022.repository.codeset.SettlementDateCode.TPlusFour, com.tools20022.repository.codeset.SettlementDateCode.TPlusFive, com.tools20022.repository.codeset.SettlementDateCode.SellersOption,
						com.tools20022.repository.codeset.SettlementDateCode.Future, com.tools20022.repository.codeset.SettlementDateCode.AsSoonAsPossible, com.tools20022.repository.codeset.SettlementDateCode.AtEndOfContract,
						com.tools20022.repository.codeset.SettlementDateCode.WhenAndIfIssued, com.tools20022.repository.codeset.SettlementDateCode.WhenDistributed,
						com.tools20022.repository.codeset.SettlementDateCode.WhenIssuedOrDistributed, com.tools20022.repository.codeset.SettlementDateCode.ToBeAnnouncedTrade, com.tools20022.repository.codeset.SettlementDateCode.EndOfMonth,
						com.tools20022.repository.codeset.SettlementDateCode.Cleared, com.tools20022.repository.codeset.SettlementDateCode.SavingsPlan, com.tools20022.repository.codeset.SettlementDateCode.WhenIssued);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Regular.getCodeName().get(), Regular);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(NextDay.getCodeName().get(), NextDay);
		codesByName.put(TPlusOne.getCodeName().get(), TPlusOne);
		codesByName.put(TPlusTwo.getCodeName().get(), TPlusTwo);
		codesByName.put(TPlusThree.getCodeName().get(), TPlusThree);
		codesByName.put(TPlusFour.getCodeName().get(), TPlusFour);
		codesByName.put(TPlusFive.getCodeName().get(), TPlusFive);
		codesByName.put(SellersOption.getCodeName().get(), SellersOption);
		codesByName.put(Future.getCodeName().get(), Future);
		codesByName.put(AsSoonAsPossible.getCodeName().get(), AsSoonAsPossible);
		codesByName.put(AtEndOfContract.getCodeName().get(), AtEndOfContract);
		codesByName.put(WhenAndIfIssued.getCodeName().get(), WhenAndIfIssued);
		codesByName.put(WhenDistributed.getCodeName().get(), WhenDistributed);
		codesByName.put(WhenIssuedOrDistributed.getCodeName().get(), WhenIssuedOrDistributed);
		codesByName.put(ToBeAnnouncedTrade.getCodeName().get(), ToBeAnnouncedTrade);
		codesByName.put(EndOfMonth.getCodeName().get(), EndOfMonth);
		codesByName.put(Cleared.getCodeName().get(), Cleared);
		codesByName.put(SavingsPlan.getCodeName().get(), SavingsPlan);
		codesByName.put(WhenIssued.getCodeName().get(), WhenIssued);
	}

	public static SettlementDateCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementDateCode[] values() {
		SettlementDateCode[] values = new SettlementDateCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementDateCode> {
		@Override
		public SettlementDateCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementDateCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}