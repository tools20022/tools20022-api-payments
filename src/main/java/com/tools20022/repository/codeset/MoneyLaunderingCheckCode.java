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
 * Specifies the status of money laundering identification procedures.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode#Passed
 * MoneyLaunderingCheckCode.Passed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode#NotChecked
 * MoneyLaunderingCheckCode.NotChecked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode#ExemptBelowLimit
 * MoneyLaunderingCheckCode.ExemptBelowLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode#ClientMoneyTypeExempt
 * MoneyLaunderingCheckCode.ClientMoneyTypeExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode#AuthorisedCredit
 * MoneyLaunderingCheckCode.AuthorisedCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode#PostalOrElectronicPaymentExempt
 * MoneyLaunderingCheckCode.PostalOrElectronicPaymentExempt}</li>
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
 * <li>"PASS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MoneyLaunderingCheckCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of money laundering identification procedures."</li>
 * </ul>
 */
public class MoneyLaunderingCheckCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Money laundering identification procedures have been carried out by the
	 * intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
	 * MoneyLaunderingCheckCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PASS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Passed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money laundering identification procedures have been carried out by the intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Passed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Passed";
			definition = "Money laundering identification procedures have been carried out by the intermediary.";
			owner_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Money laundering identification procedures have not been carried out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
	 * MoneyLaunderingCheckCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotChecked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money laundering identification procedures have not been carried out."</li>
	 * </ul>
	 */
	public static final MMCode NotChecked = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NotChecked";
			definition = "Money laundering identification procedures have not been carried out.";
			owner_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			codeName = "NOTC";
		}
	};
	/**
	 * Money laundering identification procedures have not been carried out
	 * because the transaction is below the prescribed limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
	 * MoneyLaunderingCheckCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXEM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptBelowLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money laundering identification procedures have not been carried out because the transaction is below the prescribed limit."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ExemptBelowLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ExemptBelowLimit";
			definition = "Money laundering identification procedures have not been carried out because the transaction is below the prescribed limit.";
			owner_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			codeName = "EXEM";
		}
	};
	/**
	 * Money laundering identification procedures have not been carried out
	 * because of the transaction type, eg, switch, or because the transaction
	 * is being funded from an existing investor account held by the
	 * intermediary.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
	 * MoneyLaunderingCheckCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientMoneyTypeExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money laundering identification procedures have not been carried out because of the transaction type, eg, switch, or because the transaction is being funded from an existing investor account held by the intermediary."
	 * </li>
	 * </ul>
	 */
	public static final MMCode ClientMoneyTypeExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientMoneyTypeExempt";
			definition = "Money laundering identification procedures have not been carried out because of the transaction type, eg, switch, or because the transaction is being funded from an existing investor account held by the intermediary.";
			owner_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			codeName = "CLMO";
		}
	};
	/**
	 * Money laundering identification procedures have not been carried out
	 * because the investor is an authorised credit or financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
	 * MoneyLaunderingCheckCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisedCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Money laundering identification procedures have not been carried out because the investor is an authorised credit or financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode AuthorisedCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AuthorisedCredit";
			definition = "Money laundering identification procedures have not been carried out because the investor is an authorised credit or financial institution.";
			owner_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			codeName = "AUTH";
		}
	};
	/**
	 * Limited money laundering identification procedures have been carried out
	 * because it is a one time only transaction and the payment is being made
	 * by postal, telephone or electronic transfers from an existing account
	 * with an authorised credit or financial institution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MoneyLaunderingCheckCode
	 * MoneyLaunderingCheckCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalOrElectronicPaymentExempt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Limited money laundering identification procedures have been carried out because it is a one time only transaction and the payment is being made by postal, telephone or electronic transfers from an existing account with an authorised credit or financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMCode PostalOrElectronicPaymentExempt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PostalOrElectronicPaymentExempt";
			definition = "Limited money laundering identification procedures have been carried out because it is a one time only transaction and the payment is being made by postal, telephone or electronic transfers from an existing account with an authorised credit or financial institution.";
			owner_lazy = () -> MoneyLaunderingCheckCode.mmObject();
			codeName = "POEP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("PASS");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MoneyLaunderingCheckCode";
				definition = "Specifies the status of money laundering identification procedures.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MoneyLaunderingCheckCode.Passed, com.tools20022.repository.codeset.MoneyLaunderingCheckCode.NotChecked,
						com.tools20022.repository.codeset.MoneyLaunderingCheckCode.ExemptBelowLimit, com.tools20022.repository.codeset.MoneyLaunderingCheckCode.ClientMoneyTypeExempt,
						com.tools20022.repository.codeset.MoneyLaunderingCheckCode.AuthorisedCredit, com.tools20022.repository.codeset.MoneyLaunderingCheckCode.PostalOrElectronicPaymentExempt);
			}
		});
		return mmObject_lazy.get();
	}
}