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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the date of settlement, in coded form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmRegular
 * SettlementDateCode.mmRegular}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmCash
 * SettlementDateCode.mmCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmNextDay
 * SettlementDateCode.mmNextDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmTPlusOne
 * SettlementDateCode.mmTPlusOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmTPlusTwo
 * SettlementDateCode.mmTPlusTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmTPlusThree
 * SettlementDateCode.mmTPlusThree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmTPlusFour
 * SettlementDateCode.mmTPlusFour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmTPlusFive
 * SettlementDateCode.mmTPlusFive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmSellersOption
 * SettlementDateCode.mmSellersOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmFuture
 * SettlementDateCode.mmFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmAsSoonAsPossible
 * SettlementDateCode.mmAsSoonAsPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmAtEndOfContract
 * SettlementDateCode.mmAtEndOfContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmWhenAndIfIssued
 * SettlementDateCode.mmWhenAndIfIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmWhenDistributed
 * SettlementDateCode.mmWhenDistributed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmWhenIssuedOrDistributed
 * SettlementDateCode.mmWhenIssuedOrDistributed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmToBeAnnouncedTrade
 * SettlementDateCode.mmToBeAnnouncedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmEndOfMonth
 * SettlementDateCode.mmEndOfMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmCleared
 * SettlementDateCode.mmCleared}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmSavingsPlan
 * SettlementDateCode.mmSavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#mmWhenIssued
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
public class SettlementDateCode {

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
	public static final MMCode mmRegular = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Regular";
			definition = "Settlement takes place under the standard rules applicable to the market and instrument.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmCash = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cash";
			definition = "Settlement takes place on the trade date.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmNextDay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextDay";
			definition = "Settlement takes place on the day after trade date.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmTPlusOne = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TPlusOne";
			definition = "Settlement takes place on the trade date plus one business day.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmTPlusTwo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TPlusTwo";
			definition = "Settlement takes place on the trade date plus two business days.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmTPlusThree = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TPlusThree";
			definition = "Settlement takes place on the trade date plus three business days.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmTPlusFour = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TPlusFour";
			definition = "Settlement takes place on the trade date plus four business days.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmTPlusFive = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TPlusFive";
			definition = "Settlement takes place on the trade date plus five business days.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmSellersOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellersOption";
			definition = "Settlement takes place at the choice/option of the seller.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmFuture = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Future";
			definition = "Settlement takes place on the trade date plus six or more business days.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmAsSoonAsPossible = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AsSoonAsPossible";
			definition = "Transfer is to be effected as soon as possible.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmAtEndOfContract = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AtEndOfContract";
			definition = "Transfer is to be effected at the end of the contract.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmWhenAndIfIssued = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhenAndIfIssued";
			definition = "Settlement takes place when the financial instrument is issued by the issuer.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmWhenDistributed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhenDistributed";
			definition = "Settlement takes place when the financial instrument is distributed.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmWhenIssuedOrDistributed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WhenIssuedOrDistributed";
			definition = "Settlement takes place when the financial instrument is issued or distributed.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmToBeAnnouncedTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ToBeAnnouncedTrade";
			definition = "Settlement takes place as a result of a \"to be announced\" trade.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmEndOfMonth = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EndOfMonth";
			definition = "Settlement takes place at the end of the month.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmCleared = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cleared";
			definition = "Cash settlement takes place before trade date.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmSavingsPlan = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SavingsPlan";
			definition = "Money is withdrawn automatically from the savings plan.";
			owner_lazy = () -> SettlementDateCode.mmObject();
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
	public static final MMCode mmWhenIssued = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhenIssued";
			definition = "Settlement is to be done when the security is issued.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "WISS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("REGU");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementDateCode";
				definition = "Specifies the date of settlement, in coded form.";
				code_lazy = () -> Arrays.asList(SettlementDateCode.mmRegular, SettlementDateCode.mmCash, SettlementDateCode.mmNextDay, SettlementDateCode.mmTPlusOne, SettlementDateCode.mmTPlusTwo, SettlementDateCode.mmTPlusThree,
						SettlementDateCode.mmTPlusFour, SettlementDateCode.mmTPlusFive, SettlementDateCode.mmSellersOption, SettlementDateCode.mmFuture, SettlementDateCode.mmAsSoonAsPossible, SettlementDateCode.mmAtEndOfContract,
						SettlementDateCode.mmWhenAndIfIssued, SettlementDateCode.mmWhenDistributed, SettlementDateCode.mmWhenIssuedOrDistributed, SettlementDateCode.mmToBeAnnouncedTrade, SettlementDateCode.mmEndOfMonth,
						SettlementDateCode.mmCleared, SettlementDateCode.mmSavingsPlan, SettlementDateCode.mmWhenIssued);
			}
		});
		return mmObject_lazy.get();
	}
}