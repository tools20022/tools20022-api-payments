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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the date of settlement, in coded form.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDateCode#Regular
 * SettlementDateCode.Regular}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDateCode#Cash
 * SettlementDateCode.Cash}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDateCode#NextDay
 * SettlementDateCode.NextDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#TPlusOne
 * SettlementDateCode.TPlusOne}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#TPlusTwo
 * SettlementDateCode.TPlusTwo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#TPlusThree
 * SettlementDateCode.TPlusThree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#TPlusFour
 * SettlementDateCode.TPlusFour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#TPlusFive
 * SettlementDateCode.TPlusFive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#SellersOption
 * SettlementDateCode.SellersOption}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDateCode#Future
 * SettlementDateCode.Future}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#AsSoonAsPossible
 * SettlementDateCode.AsSoonAsPossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#AtEndOfContract
 * SettlementDateCode.AtEndOfContract}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#WhenAndIfIssued
 * SettlementDateCode.WhenAndIfIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#WhenDistributed
 * SettlementDateCode.WhenDistributed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#WhenIssuedOrDistributed
 * SettlementDateCode.WhenIssuedOrDistributed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#ToBeAnnouncedTrade
 * SettlementDateCode.ToBeAnnouncedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#EndOfMonth
 * SettlementDateCode.EndOfMonth}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.SettlementDateCode#Cleared
 * SettlementDateCode.Cleared}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#SavingsPlan
 * SettlementDateCode.SavingsPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementDateCode#WhenIssued
 * SettlementDateCode.WhenIssued}</li>
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
	public static final MMCode Regular = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Cash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode NextDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode TPlusOne = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode TPlusTwo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode TPlusThree = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode TPlusFour = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode TPlusFive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode SellersOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Future = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode AsSoonAsPossible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode AtEndOfContract = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode WhenAndIfIssued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode WhenDistributed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode WhenIssuedOrDistributed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode ToBeAnnouncedTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode EndOfMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode Cleared = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode SavingsPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
	public static final MMCode WhenIssued = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhenIssued";
			definition = "Settlement is to be done when the security is issued.";
			owner_lazy = () -> SettlementDateCode.mmObject();
			codeName = "WISS";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("REGU");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
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
}