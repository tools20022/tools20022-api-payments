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
import com.tools20022.repository.codeset.BookPriorityIndicatorCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates if a Cancel/Replace instruction has caused an order to loose its
 * book priority.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BookPriorityIndicatorCode#Unchanged
 * BookPriorityIndicatorCode.mmUnchanged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BookPriorityIndicatorCode#Lost
 * BookPriorityIndicatorCode.mmLost}</li>
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
 * <li>"UNCH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BookPriorityIndicatorCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates if a Cancel/Replace instruction has caused an order to loose its book priority."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BookPriorityIndicatorCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates that the book priority is unchanged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BookPriorityIndicatorCode
	 * BookPriorityIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unchanged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates that the book priority is unchanged."</li>
	 * </ul>
	 */
	public static final BookPriorityIndicatorCode Unchanged = new BookPriorityIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unchanged";
			definition = "Indicates that the book priority is unchanged.";
			owner_lazy = () -> com.tools20022.repository.codeset.BookPriorityIndicatorCode.mmObject();
			codeName = "UNCH";
		}
	};
	/**
	 * Indicates that the book priority is lost as a result of an order change.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BookPriorityIndicatorCode
	 * BookPriorityIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LOST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lost"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the book priority is lost as a result of an order change."
	 * </li>
	 * </ul>
	 */
	public static final BookPriorityIndicatorCode Lost = new BookPriorityIndicatorCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lost";
			definition = "Indicates that the book priority is lost as a result of an order change.";
			owner_lazy = () -> com.tools20022.repository.codeset.BookPriorityIndicatorCode.mmObject();
			codeName = "LOST";
		}
	};
	final static private LinkedHashMap<String, BookPriorityIndicatorCode> codesByName = new LinkedHashMap<>();

	protected BookPriorityIndicatorCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("UNCH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BookPriorityIndicatorCode";
				definition = "Indicates if a Cancel/Replace instruction has caused an order to loose its book priority.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BookPriorityIndicatorCode.Unchanged, com.tools20022.repository.codeset.BookPriorityIndicatorCode.Lost);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Unchanged.getCodeName().get(), Unchanged);
		codesByName.put(Lost.getCodeName().get(), Lost);
	}

	public static BookPriorityIndicatorCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BookPriorityIndicatorCode[] values() {
		BookPriorityIndicatorCode[] values = new BookPriorityIndicatorCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BookPriorityIndicatorCode> {
		@Override
		public BookPriorityIndicatorCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BookPriorityIndicatorCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}