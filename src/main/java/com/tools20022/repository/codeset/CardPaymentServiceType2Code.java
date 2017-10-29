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
import com.tools20022.repository.codeset.CardPaymentServiceTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Service provided by the card payment transaction, in addition to the main
 * service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceTypeCode
 * CardPaymentServiceTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#Aggregation
 * CardPaymentServiceType2Code.Aggregation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#DCC
 * CardPaymentServiceType2Code.DCC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#Gratuity
 * CardPaymentServiceType2Code.Gratuity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#Instalment
 * CardPaymentServiceType2Code.Instalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#Loyalty
 * CardPaymentServiceType2Code.Loyalty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#NoShow
 * CardPaymentServiceType2Code.NoShow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#PurchaseCorporate
 * CardPaymentServiceType2Code.PurchaseCorporate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#RecurringPayment
 * CardPaymentServiceType2Code.RecurringPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#SolicitedAvailableFunds
 * CardPaymentServiceType2Code.SolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#UnsolicitedAvailableFunds
 * CardPaymentServiceType2Code.UnsolicitedAvailableFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code#VoiceAuthorisation
 * CardPaymentServiceType2Code.VoiceAuthorisation}</li>
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
 * <li>"AGGR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentServiceType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Service provided by the card payment transaction, in addition to the main service."
 * </li>
 * </ul>
 */
public class CardPaymentServiceType2Code extends CardPaymentServiceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Aggregation"</li>
	 * </ul>
	 */
	public static final MMCode Aggregation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Aggregation";
			owner_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DCC"</li>
	 * </ul>
	 */
	public static final MMCode DCC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DCC";
			owner_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gratuity"</li>
	 * </ul>
	 */
	public static final MMCode Gratuity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gratuity";
			owner_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instalment"</li>
	 * </ul>
	 */
	public static final MMCode Instalment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instalment";
			owner_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loyalty"</li>
	 * </ul>
	 */
	public static final MMCode Loyalty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loyalty";
			owner_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoShow"</li>
	 * </ul>
	 */
	public static final MMCode NoShow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoShow";
			owner_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PurchaseCorporate"</li>
	 * </ul>
	 */
	public static final MMCode PurchaseCorporate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PurchaseCorporate";
			owner_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringPayment"</li>
	 * </ul>
	 */
	public static final MMCode RecurringPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringPayment";
			owner_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitedAvailableFunds"</li>
	 * </ul>
	 */
	public static final MMCode SolicitedAvailableFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitedAvailableFunds";
			owner_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsolicitedAvailableFunds"</li>
	 * </ul>
	 */
	public static final MMCode UnsolicitedAvailableFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsolicitedAvailableFunds";
			owner_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardPaymentServiceType2Code
	 * CardPaymentServiceType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoiceAuthorisation"</li>
	 * </ul>
	 */
	public static final MMCode VoiceAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoiceAuthorisation";
			owner_lazy = () -> CardPaymentServiceType2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("AGGR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardPaymentServiceType2Code";
				definition = "Service provided by the card payment transaction, in addition to the main service.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardPaymentServiceType2Code.Aggregation, com.tools20022.repository.codeset.CardPaymentServiceType2Code.DCC,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.Gratuity, com.tools20022.repository.codeset.CardPaymentServiceType2Code.Instalment,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.Loyalty, com.tools20022.repository.codeset.CardPaymentServiceType2Code.NoShow,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.PurchaseCorporate, com.tools20022.repository.codeset.CardPaymentServiceType2Code.RecurringPayment,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.SolicitedAvailableFunds, com.tools20022.repository.codeset.CardPaymentServiceType2Code.UnsolicitedAvailableFunds,
						com.tools20022.repository.codeset.CardPaymentServiceType2Code.VoiceAuthorisation);
				trace_lazy = () -> CardPaymentServiceTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}